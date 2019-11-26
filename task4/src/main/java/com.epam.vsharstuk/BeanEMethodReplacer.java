package com.epam.vsharstuk;

import com.epam.vsharstuk.domain.BeanE;
import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class BeanEMethodReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        if ((o instanceof BeanE)) {
            return ((BeanE) o).getNameBeanE().toLowerCase();
        }

        return o;
    }
}
