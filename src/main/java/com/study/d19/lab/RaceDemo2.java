package com.study.d19.lab;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class RaceDemo2 {
    private static String animal = "鼠牛虎兔龍蛇馬羊猴雞狗豬";
    public static void main(String[] args) {
        Runnable r = () ->{
            int step = 1000;
            
            for (int i = 1; true ; i++) {
                if ( i == step) {
                    String threadName = Thread.currentThread().getName();
                    System.out.printf("%s 到終點了\n", threadName);
                    break;
                }
            }
        };
        for (char a : animal.toCharArray()) {
            Thread t = new Thread(r, String.valueOf(a));
            if ( a == '豬') t.setPriority(Thread.MAX_PRIORITY);else t.setPriority(Thread.MIN_PRIORITY);
            t.start();
        }
        
    }
}
