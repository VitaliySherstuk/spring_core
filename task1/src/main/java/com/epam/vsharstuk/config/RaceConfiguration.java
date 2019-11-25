package com.epam.vsharstuk.config;

import com.epam.vsharstuk.domain.Race;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class RaceConfiguration {

    @Bean(name = "raceA")
    public Race getRaceA() {
        Race race = new Race();
        race.setPlace("Minsk");
        race.setRaceNumber(1L);
        race.setDate(LocalDate.parse("2019-11-25"));
        return race;
    }

    @Bean(name = "raceB")
    public Race getRaceB() {
        Race race = new Race();
        race.setPlace("Minsk");
        race.setRaceNumber(2L);
        race.setDate(LocalDate.parse("2019-11-26"));
        return race;
    }
}
