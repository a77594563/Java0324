package com.study.d21;

import java.util.concurrent.CyclicBarrier;

public class CarPlay {
    public static void main(String[] args) {
        int n = 4;
        Runnable r = () -> {
            System.out.println("我們一起吃太陽餅...");
        };
        CyclicBarrier cb = new CyclicBarrier(n, r);
        for(int i=1;i<=n;i++) {
            Car car = new Car(cb);
            car.setName(i + "號車");
            car.start();
        }
    }
}
