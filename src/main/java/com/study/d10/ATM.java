package com.study.d10;

public class ATM {
    public void withdraw(int money){
        System.out.println("提款進行中...");
        //列印交易清單
        class Report {
            public void print(){
                System.out.println("本次交易, 提款 $" + money);
            }
        }
        //建立交易清單物件
        Report r = new Report();
        // 列印交易清單
        r.print();
        System.out.println("提款完成 !");
    }
}
