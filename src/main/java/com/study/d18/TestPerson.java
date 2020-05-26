package com.study.d18;

public class TestPerson {
    public static void main(String[] args) {
        // Arrange
        Person p = new Person();
        int age = 18;
        int excepted = 18; // 期望
        // Act
        p.setAge(age);
        int act = p.getAge();
        // Assert
        assert (excepted == act) : excepted + " == " + act;
        System.out.println("Pass");
    }
}
