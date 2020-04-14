package com.study.d07;

public class MainPerson {
    public static void main(String[] args) {
        Person p  = new Person();
        System.out.println(p.getName());
        
        Person p2  = new Person(100);
        System.out.println(p2.getName());
    }
}
