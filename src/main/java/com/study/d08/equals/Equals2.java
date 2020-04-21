package com.study.d08.equals;

public class Equals2 {
    public static void main(String[] args) {
        Ball b1 = new Ball("Red", 100);
        Ball b2 = new Ball("Red", 100);
        System.out.println(b1.getColor() + ", " + b1.getPrice());
        System.out.println(b2.getColor() + ", " + b2.getPrice());
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}
