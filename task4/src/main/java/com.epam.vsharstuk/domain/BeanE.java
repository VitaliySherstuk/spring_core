package com.epam.vsharstuk.domain;

public class BeanE {

    private String nameBeanE;

    public String getNameBeanE() {
        return nameBeanE;
    }

    public void setNameBeanE(String nameBeanE) {
        this.nameBeanE = nameBeanE;
    }

    public String getNameBeanEInUpperCase() {
        return nameBeanE.toUpperCase();
    }

    @Override
    public String toString() {
        return "BeanE{" +
                "nameBeanE='" + nameBeanE + '\'' +
                '}';
    }
}
