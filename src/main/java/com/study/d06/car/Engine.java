package com.study.d06.car;

public class Engine {
    private String name;
    private int power; //馬力
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Engine{" + "name=" + name + ", power=" + power + ", price=" + price + '}';
    }
    
    
}
