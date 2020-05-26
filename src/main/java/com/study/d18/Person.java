package com.study.d18;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18 && age < 120){
            this.age = age;
        }else{
            this.age = -1;
        }      
    }
    
}
