package com.study.d21;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car extends Thread {
    private CyclicBarrier cb;

    public Car(CyclicBarrier cb) {
        this.cb = cb;
    }
    
    @Override
    public void run() {
        String carName = Thread.currentThread().getName();
        System.out.printf("%s 台北出發...\n", carName);
        try {
            Thread.sleep(new Random().nextInt(10_000));
            System.out.printf("%s 到台中了...\n", carName);
            cb.await(); // 等待其他車子
        } catch (Exception e) {
        }
        System.out.printf("%s 到高雄了...\n", carName);
    }
    
}
