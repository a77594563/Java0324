package com.study.d07;

public class MainPerson {
    public static void main(String[] args) {
        Person p = new Person();
        Person p2 = new Person(2);
        System.out.println(p.getName());
        System.out.println(p2.getName());
    }
}
