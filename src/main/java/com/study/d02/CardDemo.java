package com.study.d02;

public class CardDemo {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.setName("黑卡");
        c1.setNumber(12345);
        c1.setBalance(Integer.MAX_VALUE);
        
        Card c2 = new Card("學生卡", 33445, 20000);
        
        System.out.println(c1); //c1.toString()
        System.out.println(c2); //c2.toString()
    }
}
