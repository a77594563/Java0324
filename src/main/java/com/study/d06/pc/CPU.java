package com.study.d06.pc;

public class CPU {
    private int speed;
    private int price;

    public CPU() {
    }
    

    public CPU(int speed, int price) {
        this.speed = speed;
        this.price = price;
    }
    
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CPU{" + "speed=" + speed + ", price=" + price + '}';
    }
    
}
