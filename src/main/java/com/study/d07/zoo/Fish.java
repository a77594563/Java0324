package com.study.d07.zoo;

public class Fish extends Animal {
    @Override
    public void eat(){
        System.out.println("吃魚飼料");
    }
    
    @Override
    public void move() {
        System.out.println("會游");
    }
}
