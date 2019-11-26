package com.epam.vsharstuk;

import com.epam.vsharstuk.domain.BeanF;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunnerLifecycle {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("lifecycle-context.xml");

        BeanF beanF = context.getBean("beanF", BeanF.class);
        context.close();
    }
}
