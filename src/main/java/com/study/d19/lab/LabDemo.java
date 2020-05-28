package com.study.d19.lab;

import java.util.Random;

public class LabDemo {
    public static void main(String[] args) {
        Runnable r = () -> {
            int ans = 777;
            for (int i = 1;; i++) {
                int n = new Random().nextInt(1000);
                if (n == ans) {
                    String threadName = Thread.currentThread().getName();
                    System.out.printf("%s 共娶了 %d 次才得到 %d\n", threadName, i, ans);
                    break;
                }
            }
            
        };
        
        Thread t1 = new Thread(r, "小明");
        Thread t2 = new Thread(r, "小華");
        
        t1.start();
        t2.start();
        
    }
}
