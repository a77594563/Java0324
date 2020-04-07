package com.study.d04;

public class WrapperDemo1 {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        String chinese = "100";
        String english = "90";
        System.out.println(Integer.parseInt(chinese) + Integer.parseInt(english));
        double x = 100.4;
        double y = 90.3;
        System.out.println(Double.min(x, y));
    }
}
