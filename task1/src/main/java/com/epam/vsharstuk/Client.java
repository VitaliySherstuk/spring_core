package com.epam.vsharstuk;

import com.epam.vsharstuk.service.impl.EmulationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {

    @Autowired
    private EmulationServiceImpl emulationService;

    public void run() {
        emulationService.start();
    }
}
