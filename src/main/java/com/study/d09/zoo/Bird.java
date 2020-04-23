package com.study.d09.zoo;

public class Bird extends Animal {

    public Bird() {
        setName("鳥");
        setLegs(2);
    }

    public void move() {
        System.out.println("我會飛");
    }

}
