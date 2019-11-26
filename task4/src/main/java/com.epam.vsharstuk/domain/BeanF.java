package com.epam.vsharstuk.domain;


import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanF implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private Logger LOG = Logger.getLogger(BeanF.class);
    private String myBeanName;
    private String beanName;
    private BeanFactory beanFactory;
    private ApplicationContext applicationContext;

    public BeanF() {
    }

    public BeanF(String myBeanName) {
        LOG.info("In bean constructor:");
        LOG.info("Object before: " + this);
        this.myBeanName = myBeanName;
        LOG.info("Object after: " + this + "\n");
    }

    public String getMyBeanName() {
        return myBeanName;
    }

    public void setMyBeanName(String myBeanName) {
        LOG.info("In setMyBeanName:");
        LOG.info("Object before: " + this);
        this.myBeanName = myBeanName;
        LOG.info("Object after: " + this + "\n");
    }

    @Override
    public void setBeanName(String beanName) {
        LOG.info("In setBeanName:");
        LOG.info("Object before setBeanName: " + this);
        this.beanName = beanName;
        LOG.info("Object after setBeanName: " + this + "\n");
    }

    private void initMethod() {
        LOG.info("In init method:");
        LOG.info("Object before initMethod: " + this);
        this.myBeanName = "INIT_METHOD";
        LOG.info("Object after initMethod: " + this + "\n");
    }


    private void destroyMethod() {
        LOG.info("In destroy method:");
        LOG.info("Object before destroyMethod: " + this);
        this.myBeanName = "Destroy_METHOD";
        LOG.info("Object after destroyMethod: " + this + "\n");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
       LOG.info("In BeanFactory:");
       LOG.info("beanFactory object before setBeanFactory: " + this);
       this.beanFactory = beanFactory;
       LOG.info("beanFactory object after setBeanFactory: " + this + "\n");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LOG.info("In afterPropertiesSet:");
        LOG.info("beanName object before afterPropertiesSet: " + this);
        this.myBeanName = "AFTER_PROPERTY_SET";
        LOG.info("beanName object after afterPropertiesSet: " + this + "\n");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        LOG.info("In setApplicationContext:");
        LOG.info("applicationContext object before: " + this);
        this.applicationContext = applicationContext;
        LOG.info("applicationContext object after: " + this + "\n");
    }

    @Override
    public void destroy() throws Exception {
        LOG.info("In destroy:");
        LOG.info("beanName object before destroy: " + this);
        this.myBeanName = "DESTROY_FOM_DISPOSABLE_BEAN";
        LOG.info("beanName object after destroy: " + this + "\n");
    }

    @Override
    public String toString() {
        return "BeanLifeCycle{" +
                "myBeanName='" + myBeanName + '\'' +
                ", beanName='" + beanName + '\'' +
                ", beanFactory=" + beanFactory +
                ", applicationContext=" + applicationContext +
                '}';
    }
}
