
package com.study.d08;


public class Varage {
    public static void main(String[] args) {
        int [] values = {100,90,80};
        System.out.println("sum = " + calc(values));
    }
    
    public static int calc(int[] values) {
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        return sum;
    }
}
