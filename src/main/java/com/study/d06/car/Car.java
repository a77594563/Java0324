package com.study.d06.car;

import java.util.stream.Stream;

public class Car {
    private Engine engine;
    private SteeringWheel steeringWheel;
    private Wheel[] wheels;
    private String name;
    private int price;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        int price = engine.getPrice() + steeringWheel.getPrice() + Stream.of(wheels).mapToInt(w -> w.getPrice()).sum();
        price *= 3;
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
