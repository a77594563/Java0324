package com.study.d11.collection;

import java.util.TreeSet;
import java.util.Set;

public class BookDemo2 {
    public static void main(String[] args) {
        Book.sort = 1;
        Book b1 = new Book("Java8", "Vincent", 500);
        Book b2 = new Book("Python先修", "Bob", 400);
        Book b3 = new Book("C++", "Mary", 300);
        Set<Book> books = new TreeSet<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        System.out.println(books);
        System.out.println(books.size());
        
    }
}
