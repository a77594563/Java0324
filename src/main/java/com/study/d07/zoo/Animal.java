package com.study.d07.zoo;

public class Animal {
    // 物件屬性
    private String name; // 動物的名字
    private int legs; // 動物的腳數

    // 封裝的方法 -> 屬性
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    // 其他商業方法
    public void eat(){
        System.out.println("吃食物");
    }

    public void move(){
        System.out.println("會移動");
    }
}
