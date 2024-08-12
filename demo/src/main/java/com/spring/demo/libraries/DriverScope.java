package com.spring.demo.libraries;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.SimpleThreadScope;

//Custom Scope
public class DriverScope extends SimpleThreadScope {
    public DriverScope() {
        super();
    }

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        return super.get(name, objectFactory);
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }
}
