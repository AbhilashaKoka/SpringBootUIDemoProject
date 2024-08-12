package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class Car {
    public Car()
    {
        System.out.println("Car Instantiated");
    }

    public void getCar()
    {
        System.out.println("Toyota Car");
    }
}
