package com.epam.vsharstuk.service.impl;

import com.epam.vsharstuk.domain.Horse;
import com.epam.vsharstuk.service.HorseService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Service to manage herd.
 */
@Service
public class HorseServiceImpl implements HorseService, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public List<Horse> getAllHorses() {
        return new ArrayList(applicationContext.getBeansOfType(Horse.class).values());
    }

    @Override
    public List<Horse> getRandomHorseList() {
        List<Horse> horses = this.getAllHorses();
        Collections.shuffle(horses);
        return horses.subList(0, 7);
    }

    @Override
    public Horse findHorseByHorseName(String name) {
        return getAllHorses().stream()
                .filter(horse -> horse.getRider().equals(name))
                .findFirst()
                .get();
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
