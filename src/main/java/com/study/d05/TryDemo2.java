package com.study.d05;

public class TryDemo2 {
    public static void main(String[] args) {
        try {
            calc(10, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    public static void calc(int x, int y) {
        int sum = 0;
        if(y == 0) {
            ArithmeticException e = new ArithmeticException("分母不可為0");
            throw e;
        }
        sum = x / y;
        System.out.printf("sum = %d\n", sum);
    }
}
