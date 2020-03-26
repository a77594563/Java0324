package com.study.d02;

public class BankDemo {
    public static void main(String[] args) {
        Bank.name = "國泰世華"; //類別變數
        
        Bank b1 = new Bank();
        //b1.name = "國泰世華";
        b1.account = 123;
        b1.balance = 54000;
        

        Bank b2 = new Bank();
        //b2.name = "彰化銀行";
        b2.account = 567;
        b2.balance = 48000;
        
        b1.printBalance();
        b2.printBalance();
        Bank.printName();
    }
}
