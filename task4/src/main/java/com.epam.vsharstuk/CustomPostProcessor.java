package com.epam.vsharstuk;

import com.epam.vsharstuk.domain.BeanF;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomPostProcessor implements BeanPostProcessor {

    private Logger LOG = Logger.getLogger(CustomPostProcessor.class);


    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if (o instanceof BeanF) {
            BeanF beanF = (BeanF) o;
            LOG.info("Object before method postProcessBefore: " + beanF);
            beanF.setBeanName("POST_PROCESS_BEFORE_NAME");
            LOG.info("Object after method postProcessBefore: " + beanF);
        }
            return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        if (o instanceof BeanF) {
            BeanF beanF = (BeanF) o;
            LOG.info("Object before method postProcessAfter: " + beanF);
            beanF.setBeanName("POST_PROCESS_AFTER_NAME");
            LOG.info("Object after method postProcessAfter: " + beanF);
        }
            return o;
    }
}
