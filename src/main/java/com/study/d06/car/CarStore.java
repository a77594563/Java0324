package com.study.d06.car;

import java.util.stream.Stream;

public class CarStore {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setName("6");
        engine.setPower(6000);
        engine.setPrice(50_0000);
        
        SteeringWheel steeringWheel = new SteeringWheel();
        steeringWheel.setName("方向盤");
        steeringWheel.setPrice(12_0000);
        
        Wheel w1 = new Wheel();
        w1.setName("米其林");
        w1.setSize(17.5);
        w1.setPrice(5000);
        Wheel w2 = new Wheel();
        w2.setName("米其林");
        w2.setSize(17.5);
        w2.setPrice(5000);
        Wheel w3 = new Wheel();
        w3.setName("米其林");
        w3.setSize(17.5);
        w3.setPrice(5000);
        Wheel w4 = new Wheel();
        w4.setName("米其林");
        w4.setSize(17.5);
        w4.setPrice(5000);
        
        Wheel[] wheels = {w1, w2, w3, w4};
        
        Car car = new Car();
        car.setEngine(engine);
        car.setSteeringWheel(steeringWheel);
        car.setWheels(wheels);
        car.setName("BMW");
        System.out.println(car.getEngine());
        System.out.println(car.getSteeringWheel());
        Stream.of(car.getWheels()).forEach(System.out::println);
        System.out.printf("%s 的售價是: $%,d\n", car.getName(), car.getPrice());
    }
}
