package com.epam.vsharstuk.domain;

public class BeanB {

    private BeanA beanA;

    public BeanB(BeanA beanA) {
        beanA.setFirstField(beanA.getFirstField());
        this.beanA = beanA;
    }

    public BeanA getBeanA() {
        return beanA;
    }

    public void setBeanA(BeanA beanA) {
        this.beanA = beanA;
    }

    @Override
    public String toString() {
        return "BeanB{" +
                "beanA=" + beanA +
                '}';
    }
}
