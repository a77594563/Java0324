package com.study.d09.zoo;

import java.util.stream.Stream;

public class Zoo2 {
    public static void main(String[] args) {
        /*
            Stream.of(new Bird(), new Lion(), new Fish(), new Ostrich())
                .forEach(a -> System.out.println(a));
        */
        Stream.of(new Bird(), new Lion(), new Fish(), new Ostrich())
                .forEach(System.out::println);
        int sum = Stream.of(new Bird(), new Lion(), new Fish(), new Ostrich())
                    .mapToInt(a -> a.getLegs())
                    .sum();
        System.out.printf("總共有 %d 隻腿\n", sum);
        
        Stream.of(new Bird(), new Lion(), new Fish(), new Ostrich())
                .map(a -> a.getName())
                .forEach(System.out::println);
    }
}
