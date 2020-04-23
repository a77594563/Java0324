package com.study.d09.pet;

//規格
public interface Dog {

    int legs = 4;  // 相當於 public static final int legs = 4;

    void eat();   // 相當於 public abstract void eat();

    void skill();  // 相當於 public abstract void skill();
}
