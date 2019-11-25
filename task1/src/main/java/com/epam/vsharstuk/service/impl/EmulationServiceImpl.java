package com.epam.vsharstuk.service.impl;

import com.epam.vsharstuk.domain.Horse;
import com.epam.vsharstuk.domain.Race;
import com.epam.vsharstuk.service.EmulationService;
import com.epam.vsharstuk.service.RaceService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Class to emulate race.
 */
public class EmulationServiceImpl implements EmulationService, ApplicationContextAware {

    private static final int COUNT_ROUND = 5;
    private ApplicationContext applicationContext;

    @Override
    public void start() {
        RaceService raceService = applicationContext.getBean(RaceServiceImpl.class);
        Race race = raceService.getRace();

        if (race == null) {
            System.out.println("We do not have any races.");
            return;
        }

        List<Horse> participants = race.getHorses();
        System.out.println("RACE: " + race.getDate() + "   " + race.getPlace());
        System.out.println("Participants: ");
        showParticipantsTable(participants);
        Map<String, Integer> bet = this.makeBet(race);
        IntStream.iterate(1, i -> i + 1)
                .limit(COUNT_ROUND)
                .peek(item -> {
                    if (item < COUNT_ROUND + 1) {
                        System.out.println("Round: " + (item));
                    } else {
                        System.out.println("Finish: ");
                    }
                })
                .forEach(round -> {
                    try {
                        Thread.sleep(5000L);
                    } catch (InterruptedException var3) {
                        var3.printStackTrace();
                    }

                    Collections.shuffle(participants);
                    showParticipantsTable(participants);
                });
        showWinPrise(bet, participants);
    }

    void showParticipantsTable(List<Horse> participants) {
        IntStream.iterate(1, (i) -> i + 1)
                .limit(participants.size())
                .forEach((item) -> {
                    String result = String.format("[%s]     %s      %s", item, (participants.get(item - 1)).getName(), ((Horse) participants.get(item - 1)).getRider().getName());
                    System.out.println(result);
                });
    }

    void showWinPrise(Map<String, Integer> bet, List<Horse> participants) {
        System.out.println("==================================");
        Optional<Map.Entry<String, Integer>> betEntry = bet.entrySet().stream().findFirst();
        int betValue = betEntry.isPresent() ? betEntry.get().getValue() : 0;
        boolean isWinner = bet.containsKey(participants.get(0).getName());
        double prise = getPrise(betValue, applicationContext.getBean(RaceServiceImpl.class).getPriseKoeff(participants), isWinner);
        System.out.println("Prise: " + prise + "$");

    }

    double getPrise(int bet, double koeff, boolean isWinner) {
        return !isWinner ? 0.0 : koeff * (double) bet + (double) bet;
    }

    Map<String, Integer> makeBet(Race race) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name: ");
        String nameHorse = myObj.nextLine();
        System.out.println("Enter bet: ");
        int bet = myObj.nextInt();
        return Collections.singletonMap(nameHorse, bet);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
