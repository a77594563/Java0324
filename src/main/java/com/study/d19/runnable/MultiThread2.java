package com.study.d19.runnable;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MultiThread2 {
    public static void main(String[] args) {
        // java 8
        Runnable r1 = () -> {
            System.out.println( new Random().nextInt(100) );
        };
        
        Runnable r2 = () -> {
            Set<Integer> lotto = new TreeSet<>();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            while ( lotto.size() < 5) {                
                lotto.add(new Random().nextInt(39) + 1);
            }
            System.out.println(lotto);
        };
        Thread t1 = new Thread(r1, "Brain");
        t1.start();
        Thread t2 = new Thread(r2, "Dow");
        t2.start();
        // 總共有幾條執行緒?
        System.out.printf("總共有 %d 條執行緒\n", Thread.activeCount());
    }
}
