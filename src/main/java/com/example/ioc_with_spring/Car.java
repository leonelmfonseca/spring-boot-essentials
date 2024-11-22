package com.example.ioc_with_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private final Engine engine;

    @Autowired
    public Car(Engine engine) {

        this.engine = engine;
    }

    public void start(){
        this.engine.start();
        System.out.println("Car started");
    }

}
