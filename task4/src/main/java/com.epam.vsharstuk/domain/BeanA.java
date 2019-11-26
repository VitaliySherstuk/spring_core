package com.epam.vsharstuk.domain;

public class BeanA {

    private String firstField;

    public String getFirstField() {
        return firstField;
    }

    public void setFirstField(String firstField) {
        this.firstField = firstField;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "firstField='" + firstField + '\'' +
                '}';
    }
}
