package com.study.d10;

import java.util.Random;
import java.util.function.Supplier;

public class LottoMain {
    public static void main(String[] args) {
        int n = 6;
        Supplier<Integer> s = () -> new Random().nextInt(49) + 1;
        print(n, s);
    }
    public static void print(int n,  Supplier<Integer> s){
        for (int i = 1; i <= n; i++) {
            System.out.print(s.get() + " ");
        }
        System.out.println();
    }
}
