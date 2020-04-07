package com.study.d04;

public class WrapperDemo3 {
    public static void main(String[] args) {
        Integer a = 100; // autoboxing
        int b = 200;
        print(a);
        print(b);
    }
    public static void print(Integer x) {
        System.out.println("我是接受 Integer 參數的方法, Integer x = " + x);
    }
    public static void print(int x) {
        System.out.println("我是接受 int 參數的方法, int x = " + x);
    }
    
}
