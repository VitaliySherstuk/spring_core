package com.epam.vsharstuk;

import com.epam.vsharstuk.domain.BeanA;
import com.epam.vsharstuk.domain.BeanB;
import com.epam.vsharstuk.domain.BeanC;
import com.epam.vsharstuk.domain.BeanE;
import com.epam.vsharstuk.domain.BeanF;
import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    private static Logger LOG = Logger.getLogger(Runner.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        LOG.info("Bean_A: " + context.getBean("beanA", BeanA.class) + "\n");
        LOG.info("Bean_B: " + context.getBean("beanB", BeanB.class) + "\n");

        BeanC firstBeanC = context.getBean("beanC", BeanC.class);
        BeanC secondBeanC = context.getBean("beanC", BeanC.class);
        LOG.info("First_Bean_C: " + firstBeanC);
        LOG.info("Second_Bean_C: " + secondBeanC);
        LOG.info("Equals_Link_Beans_C: " + (firstBeanC == secondBeanC) + "\n");

        BeanC beanCLookUp = context.getBean("beanCLookUp", BeanC.class);
        LOG.info("Bean_C_Look_Up: " + beanCLookUp);
        LOG.info("Get beanD by Look up: " + beanCLookUp.getBeanDByLookUpMethod()  + "\n");

        BeanE beanE = context.getBean("beanE", BeanE.class);
        LOG.info("BeanE name: " + beanE.getNameBeanE());
        LOG.info("BeanE name by replacer. It should be in the lower case: " + beanE.getNameBeanEInUpperCase());

    }
}
