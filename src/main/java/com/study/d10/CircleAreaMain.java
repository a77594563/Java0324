package com.study.d10;

import java.util.function.Function;

public class CircleAreaMain {
    public static void main(String[] args) {
        int [] rs = {10, 9, 8, 7};
        Function<Integer, Double> f = (r) -> r * r * Math.PI; // 圓面積
        // (4/3)πr3 球體積
        Function<Integer, Double> f2 = (r) -> (4/3) * Math.PI * Math.pow(r, 3); // 球體積
        print(rs, f);
        print(rs, f2);
    }
    
    public static void print(int[] rs, Function<Integer, Double> f){
        for (int r : rs) {
            System.out.println(f.apply(r));
        }
    }
}
