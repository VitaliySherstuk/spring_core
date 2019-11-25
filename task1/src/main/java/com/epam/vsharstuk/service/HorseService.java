package com.epam.vsharstuk.service;

import com.epam.vsharstuk.domain.Horse;

import java.util.List;

public interface HorseService {

    List<Horse> getAllHorses();
    List<Horse> getRandomHorseList();
    Horse findHorseByHorseName(String name);
}
