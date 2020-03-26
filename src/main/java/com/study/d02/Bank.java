package com.study.d02;

public class Bank {
    static String name = "中國信託"; //銀行名稱
    int account; //銀行帳號(五碼)
    int balance;   //帳戶餘額
    
    void printBalance(){ //印出你的帳戶資料
        System.out.printf("%s 帳號: %05d, 餘額: $%,d\n", name, account, balance);
    }
    
    static void printName(){
        System.out.printf("銀行名稱: %s\n", name);
    }
}
