package com.epam.vsharstuk.domain;

public class BeanC {

    private BeanD beanD;
    private String nameBeanC;
    private BeanD beanDByLookUpMethod;

    public BeanC() {
    }

    public String getNameBeanC() {
        return nameBeanC;
    }

    public void setNameBeanC(String nameBeanC) {
        this.nameBeanC = nameBeanC;
    }

    public BeanD getBeanDByLookUpMethod() {
        return null;
    }

    public void setBeanDByLookUpMethod(BeanD beanDByLookUpMethod) {
        this.beanDByLookUpMethod = beanDByLookUpMethod;
    }

    public BeanD getBeanD() {
        return beanD;
    }

    public void setBeanD(BeanD beanD) {
        this.beanD = beanD;
    }

    @Override
    public String toString() {
        return "BeanC{" +
                "beanD=" + beanD +
                ", nameBeanC='" + nameBeanC + '\'' +
                ", beanDByLookUpMethod=" + beanDByLookUpMethod +
                '}';
    }
}
