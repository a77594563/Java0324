package com.study.d10;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class LottoMain {
    public static void main(String[] args) {
        int n = 6;
        Supplier<Integer> s = () -> new Random().nextInt(49) + 1;
        print(n, s);
        print2(n, s);
    }
    public static void print(int n,  Supplier<Integer> s){
        for (int i = 1; i <= n; i++) {
             System.out.printf("%d:%d  ", i, s.get());
        }
        System.out.println();
    }
    
    public static void print2(int n,  Supplier<Integer> s){
        IntStream.rangeClosed(1, n).forEach((i) -> System.out.printf("%d:%d  ", i, s.get()));
        System.out.println();
    }
}
