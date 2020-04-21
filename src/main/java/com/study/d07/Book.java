package com.study.d07;

public class Book {
    private int price;
    // 建構子
    public Book(int p) {
        price = p;
    }
    public Book() {
        this(50);
    }
    public int getPrice() {
        return price;
    }
}
