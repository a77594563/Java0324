package com.study.d01;

public class Bird {
    String name;
    String color;
    int price;
    
    void skill(){
        System.out.println("我會飛");
        if( price >= 40000){
            System.out.println("我會唱歌");
        }
    }
}
