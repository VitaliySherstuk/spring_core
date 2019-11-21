package com.epam.vsharstuk;

import com.epam.vsharstuk.domain.Horse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Horse horse = context.getBean("horseA", Horse.class);
        System.out.println(horse);
    }
}
