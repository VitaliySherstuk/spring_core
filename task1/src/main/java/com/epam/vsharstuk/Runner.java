package com.epam.vsharstuk;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("com.epam.vsharstuk");
        Client client = context.getBean(Client.class);
        client.run();

    }
}
