package com.study.d20;

import java.util.Random;

class GetLuckyNumber extends Thread {
    @Override
    public void run() {
        System.out.println("資料計算中...");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        int number = new Random().nextInt(100);
        System.out.printf("Lucky number is %d\n", number);
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        GetLuckyNumber num = new GetLuckyNumber();
        num.start();
        GetLuckyNumber num2 = new GetLuckyNumber();
        num2.start();
    }
}
