package com.study.d08.zoo;


public class zoo2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Bird bird = new Bird();
        Tiger tiger = new Tiger();
        show(cat);
        show(bird);
        show(tiger);
    }
    
    public static void show(Animal animal){
        animal.cry();
    }
}
