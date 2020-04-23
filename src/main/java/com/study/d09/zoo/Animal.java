package com.study.d09.zoo;

public class Animal {

    private String name;

    private int legs;

    public void move() {
        System.out.println("移動");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name  = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", legs=" + legs + '}';
    }

}
