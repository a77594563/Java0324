package com.study.d03.array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] i  = { 5, 6, 7, 8, 9};
        System.out.println(i.length);
        System.out.println(i[0]);
        System.out.println(i[i.length-1]);
        
        i = new int[]{ 1, 2, 3}; //換陣列必須要new
        System.out.println(i[1]);
    }
}
