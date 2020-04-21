package com.study.d08.equals;

public class Equals3 {
    public static void main(String[] args) {
        Book b1 = new Book("Java", 100);
        Book b2 = new Book("Java", 100);
        System.out.println(b1); // 自動呼叫 toString();
        System.out.println(b2); // 自動呼叫 toString();
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}
