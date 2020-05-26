package com.study.d18;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        assert age >= 18 && age <= 150 : age + " 歲不合法";
        this.age = age;
    }
    
}
