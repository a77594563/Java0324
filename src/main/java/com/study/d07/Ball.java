package com.study.d07;

public class Ball {
    // 建構子
    public Ball(){
        this(100);
        System.out.println("執行 Ball 建構子");
    }
    
    // 建構子
    public Ball(int x){
        
        System.out.printf("執行 Ball 建構子, x = %,d\n", x);
    }
}
