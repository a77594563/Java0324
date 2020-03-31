package com.study.d03.array;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String s = "Java";
        s.concat("8"); //另外創建字串物件, 但是沒有stack位置沒有指派新位置
        System.out.println(s);
        
        StringBuilder sb = new StringBuilder("Java");
        sb.append("8"); //在原字串物件中新增資料
        System.out.println(sb);
    }
}
