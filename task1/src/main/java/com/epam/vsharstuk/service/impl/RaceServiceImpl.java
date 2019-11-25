package com.epam.vsharstuk.service.impl;

import com.epam.vsharstuk.domain.Horse;
import com.epam.vsharstuk.domain.Race;
import com.epam.vsharstuk.service.RaceService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Service to manage race and calculate prise koeff for current race.
 */
public class RaceServiceImpl implements RaceService, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public Race getRace() {
        List<Horse> horses = applicationContext.getBean(HorseServiceImpl.class).getRandomHourseList();
        Optional<Race> currentRaceOptional = getCurrentRace();
        Race currentRace = currentRaceOptional.isPresent() ? currentRaceOptional.get() : null;

        if (currentRace != null) {
            currentRace.setHorses(horses);
        }

        return currentRace;
    }

    Optional<Race> getCurrentRace() {
        LocalDate now = LocalDate.now();
        List<Race> races = new ArrayList(applicationContext.getBeansOfType(Race.class).values());
        return races.stream()
                .filter(item -> item.getDate().isEqual(now))
                .sorted(Comparator.comparing(Race::getDate))
                .findFirst();
    }

    @Override
    public double getPriseKoeff(List<Horse> horses) {
        Horse lider = horses.get(0);
        int maxSpeed = (horses.stream().max(Comparator.comparing(Horse::getSpeed)).get()).getSpeed();
        int koeff = 1 - (lider.getSpeed() / maxSpeed);
        return koeff == 0 ? 0.1 : koeff;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
