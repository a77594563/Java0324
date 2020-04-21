package com.study.d07;

import java.util.Date;

public class Fibonacci {
    public static int f(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return f(n-1) + f(n-2);
    }
    public static void main(String[] args) {
        long start = new Date().getTime();
        System.out.println(Fibonacci.f(45));
        long end = new Date().getTime();
        System.out.printf("%.2f 秒\n", (end - start)/1000.0);
    }
}
