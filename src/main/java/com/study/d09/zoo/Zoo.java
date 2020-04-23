package com.study.d09.zoo;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Ostrich();
        showTime(animal);
    }
    
    public static void showTime(Animal animal){
        System.out.printf("我是 %s, 有 %d 隻腿, ", animal.getName(), animal.getLegs());
        animal.move();
        
        if(animal instanceof Ostrich){
            ((Ostrich)animal).spirit();
        }
    }
}
