package com.study.d07;

import java.util.Calendar;

public class Person {
    private static int age;
    
    // static 初始值得實作區段
    static {
        age = 18;
    }
    
    private String name;
    // 共同建構子實作
    {
        Calendar cal = Calendar.getInstance();
        int h = cal.get(Calendar.HOUR_OF_DAY);
        name = (h < 12)?"Mary":"Snow";
    }
    
    public Person() {
        
    }
    
    public Person(int x) {
        
    }
    
    public String getName() {
        return name;
    }
}
