package com.study.d08.zoo;

public class zoo5 {
    public static void main(String[] args) {
        Animal animal = new Tiger();
        animal.cry();
        ((Cat)animal).cry();
        ((Tiger)animal).cry();
        if (animal instanceof Bird) {
            ((Bird)animal).cry();
        }else{
            System.out.println("animal 不可轉成 Bird");
        }
        
    }
}
