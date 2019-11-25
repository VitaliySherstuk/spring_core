package com.epam.vsharstuk.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Objects;

/**
 * Class to keep data about horse breed.
 */
public class Breed {

    private String horseBreed;

    public String getHorseBreed() {
        return horseBreed;
    }

    public void setHorseBreed(String horseBreed) {
        this.horseBreed = horseBreed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Breed breed = (Breed) o;
        return Objects.equals(horseBreed, breed.horseBreed);
    }

    @Override
    public int hashCode() {

        return Objects.hash(horseBreed);
    }

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).toString();
    }
}
