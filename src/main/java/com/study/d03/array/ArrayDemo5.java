package com.study.d03.array;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//使用java 8
public class ArrayDemo5 {

    public static void main(String[] args) {
        int[] lottos = new int[6];
        IntStream.of(lottos).forEach(d -> {
            while (true) {
                int n = new Random().nextInt(10) + 1;
                if (exist(n, lottos)) {
                    d = n;
                    break;
                } else {
                    continue;
                }

            }
        });
        IntStream.of(lottos).forEach( x -> System.out.print(x + ", ") );
        System.out.println();
    }

    public static boolean exist(int n, int[] lottos) {
        return IntStream.of(lottos).anyMatch(x -> x == n);
    }
}
