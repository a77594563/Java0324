package com.study.d04;

public class RefCase5 {
    public static void main(String[] args) {
        int x = 90;
        x = addTen(x);
        System.out.println(x);
    }
    public static int addTen(int x) {
        x = x + 10;
        return x;
    }
}
