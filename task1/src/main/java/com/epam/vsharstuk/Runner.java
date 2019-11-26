package com.epam.vsharstuk;

import com.epam.vsharstuk.service.EmulationService;
import com.epam.vsharstuk.service.impl.EmulationServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmulationService service = context.getBean(EmulationServiceImpl.class);
        service.start();
    }
}
