package com.study.d09.pet;

public class PetStore {
    public static void main(String[] args) {
        ADog d1 = new Chihuahua();
        ADog d2 = new Shiba();
        ADog d3 = new PitBull();
        Dog d4 = new EDog();
        showTime(d1);
        showTime(d2);
        showTime(d3);
        showTime(d4);
    }
    public static void showTime(ADog dog){
        System.out.println("活的狗");
        dog.eat();
        dog.skill();
    }
    public static void showTime(Dog dog){
        dog.eat();
        dog.skill();
    }
    
}
