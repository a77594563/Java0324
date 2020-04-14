package com.study.d07;

public class MainBook {
    public static void main(String[] args) {
        Book b = new Book(100);
        System.out.println(b.getPrice());
        Book b2 = new Book();
        System.out.println(b2.getPrice());
    }
}
