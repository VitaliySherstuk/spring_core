package com.epam.vsharstuk.service;

import com.epam.vsharstuk.domain.Horse;
import com.epam.vsharstuk.domain.Race;

import java.util.List;

public interface EmulationService {

    List<Horse> start(Race race);
}
