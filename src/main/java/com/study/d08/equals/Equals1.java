package com.study.d08.equals;

public class Equals1 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = "Java";
        //System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
