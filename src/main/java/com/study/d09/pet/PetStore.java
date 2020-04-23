package com.study.d09.pet;

public class PetStore {
    public static void main(String[] args) {
        Dog d1 = new Chihuahua();
        Dog d2 = new Shiba();
        Dog d3 = new PitBull();
        Dog d4 = new EDog();
        showTime(d1);
        showTime(d2);
        showTime(d3);
        showTime(d4);
    }
    public static void showTime(Dog dog){
        dog.eat();
        dog.skill();
    }
}
