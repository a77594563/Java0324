package com.study.d07;

// 超載(Overloading)練習

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Transaction {
    void sumbit(int money){
        System.out.printf("現金 $%d 結帳\n", money);
    }
    void sumbit(int money1, int money2, int money3){
        int total = money1 + money2 + money3;
        System.out.printf("現金1 $%d 結帳\n", money1);
        System.out.printf("現金2 $%d 結帳\n", money2);
        System.out.printf("現金3 $%d 結帳\n", money3);
        System.out.println("---------------------");
        System.out.printf("小計 $%d \n", total);
    }
    
    void submit(int[] money) {
        int total = IntStream.of(money).sum();
        IntStream.of(money).forEach(m -> {
            System.out.printf("現金 $%d 結帳\n", m);
        });
        System.out.println("---------------------");
        System.out.printf("小計 $%d \n", total);
    }
    
    void sumbit(String cardNo){
        System.out.printf("Yoyo 卡號: $%s 結帳\n", cardNo);
    }
    void sumbit(Double point){
        System.out.printf("點數 $%.1f 結帳\n", point);
    }
    void sumbit(){
        System.out.println("賒帳");
    }
    public static void main(String[] args) {
        Transaction t = new Transaction();
        t.sumbit();
        t.sumbit(10.5);
        t.sumbit("111-222-333-444");
        t.sumbit(100);
        t.sumbit(100, 200, 300);
        int[] money = {100, 200, 300, 400, 500, 600};
        t.submit(money);
    }
}
