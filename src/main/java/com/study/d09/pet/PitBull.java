package com.study.d09.pet;

public class PitBull implements Dog{

    @Override
    public void eat() {
        System.out.println("狗罐頭");
    }

    @Override
    public void skill() {
        System.out.println("打獵");
    }
    
}
