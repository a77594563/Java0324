package com.study.d04;

public class RefCase4 {
    public static void main(String[] args) {
        int x = 90;
        addTen(x);
        System.out.println(x);
    }
    public static void addTen(int x) {
        x = x + 10;
    }
}
