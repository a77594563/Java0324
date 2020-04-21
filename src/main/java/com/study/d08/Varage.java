
package com.study.d08;

import java.util.stream.IntStream;


public class Varage {
    public static void main(String[] args) {
        int [] values = {100,90,80};
        System.out.println("sum = " + calc(values));
        System.out.println("sum = " + calc(123, 7));
        System.out.println("sum = " + calc());
    }
    
    public static int calc(int... values) {
        return IntStream.of(values).sum();
    }
}
