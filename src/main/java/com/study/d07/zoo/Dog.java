package com.study.d07.zoo;

public class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("吃骨頭");
    }
    
    @Override
    public void move() {
        System.out.println("會跑");
    }
}
