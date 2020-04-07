package com.study.d05;

public class TryDemo {
    public static void main(String[] args) {
        calc(10, 0);
    }
    public static void calc(int x, int y) {
        int sum = 0;
        try {
            sum = x / y;
        } catch (Exception e) {
            System.out.printf("分母不可為零, 錯誤訊息: %s\n", e);
        }
        System.out.printf("sum = %d\n", sum);
    }
}
