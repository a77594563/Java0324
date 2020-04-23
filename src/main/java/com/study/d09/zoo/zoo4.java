package com.study.d09.zoo;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class zoo4 {
    public static void main(String[] args) {
        Predicate<Animal> legMoreThen2 = a -> a.getLegs() >= 2;
        Predicate<Animal> nameMoreThen2 = a -> a.getName().length() >= 2;
        
        int sum = Stream.of(new Bird(), new Lion(), new Fish(), new Ostrich())
                    .filter(legMoreThen2)
                    .filter(nameMoreThen2)
                    .peek(System.out::println)
                    .mapToInt(Animal::getLegs) // a -> a.getLegs()
                    .sum();
        System.out.println("大於2隻腿的總數 = " + sum);
    }
}
