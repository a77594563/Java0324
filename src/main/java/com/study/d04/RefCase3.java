package com.study.d04;

public class RefCase3 {
    public static void main(String[] args) {
        String sb = new String("Java");
        System.out.println(sb);
        sb = addVersion(sb);
        System.out.println(sb);
    }
    public static String addVersion(String data) {
        data = data.concat("8");
        return data;
    }
}
