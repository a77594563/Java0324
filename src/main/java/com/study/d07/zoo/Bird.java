package com.study.d07.zoo;

public class Bird extends Animal{
    
    @Override
    public void eat() {
        System.out.println("吃小米");
    }

    @Override
    public void move() {
        System.out.println("會飛");
    }
    
    
}
