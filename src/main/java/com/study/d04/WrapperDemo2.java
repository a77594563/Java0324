package com.study.d04;

public class WrapperDemo2 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println(a + b);
        Integer c = Integer.valueOf(300); // new Integer(300)
        System.out.println(a + c.intValue());
        // Java 1.5 之後 autoboxing
        Integer d = 300; // Integer.valueOf(300)
        // Java 1.5 之後 autounboxing
        System.out.println(a + d); // d.intValue()
        
    }
}
