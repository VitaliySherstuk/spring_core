package com.epam.vsharstuk.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Class to keep data about race.
 */
public class Race {

    private LocalDate date;
    private long raceNumber;
    private String place;
    private List<Horse> horses = Collections.emptyList();

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public long getRaceNumber() {
        return raceNumber;
    }

    public void setRaceNumber(long raceNumber) {
        this.raceNumber = raceNumber;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return raceNumber == race.raceNumber &&
                Objects.equals(date, race.date) &&
                Objects.equals(place, race.place) &&
                Objects.equals(horses, race.horses);
    }

    @Override
    public int hashCode() {

        return Objects.hash(date, raceNumber, place, horses);
    }

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).toString();
    }
}
