package com.study.d07;

public class Book {
    private  int price;
    
    //建構子
    public Book(){
        this(50);
    }
    
    //建構子
    public Book(int p){
        price = p;
    }
    
    public int getPrice(){
        return price;
    }
}
