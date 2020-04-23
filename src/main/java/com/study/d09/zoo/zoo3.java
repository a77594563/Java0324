package com.study.d09.zoo;

import java.util.stream.Stream;

public class zoo3 {
    public static void main(String[] args) {
        int sum = Stream.of(new Bird(), new Lion(), new Fish(), new Ostrich())
                .peek(System.out::println) 
                .mapToInt(a  -> a.getLegs())
                .peek(System.out::println)
                .sum();
        System.out.println("sum = " + sum);
    }
}
