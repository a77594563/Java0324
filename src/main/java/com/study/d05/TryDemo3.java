package com.study.d05;

public class TryDemo3 {
    public static void main(String[] args) {
        try {
            calc(10, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    public static void calc(int x, int y) throws Exception{
        int sum = 0;
        if(y == 0) {
            Exception e = new Exception("分母不可為0");
            throw e;
        }
        sum = x / y;
        System.out.printf("sum = %d\n", sum);
    }
}
