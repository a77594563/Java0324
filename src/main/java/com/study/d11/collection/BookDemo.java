package com.study.d11.collection;

import java.util.HashSet;
import java.util.Set;

public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java8", "Vincent", 500);
        Book b2 = new Book("Python先修", "Bob", 400);
        Book b3 = new Book("C++", "Mary", 300);
        Book b4 = new Book("C++", "Mary", 300);
        Set<Book> books = new HashSet<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        System.out.println(books);
        System.out.println(books.size());
        // 總價 = ?
        int sum = books.stream().mapToInt(b -> b.getPrice()).sum();
        System.out.println(sum);
        int sum2 = books.stream().mapToInt(Book::getPrice).sum();
        System.out.println(sum2);
        
    }
}
