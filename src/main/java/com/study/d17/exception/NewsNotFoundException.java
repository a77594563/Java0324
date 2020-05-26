package com.study.d17.exception;

public class NewsNotFoundException extends Exception {

    public NewsNotFoundException(String string) {
        super(string);
    }
    
    public void why() {
        System.out.println("News 只有最近 30 天的資料 !");
    }
}
