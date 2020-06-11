package com.study.d22.lock;

import java.util.concurrent.atomic.AtomicInteger;

class MyInt extends Thread {

    AtomicInteger i = new AtomicInteger();

    @Override
    public void run() {
        while (true) {
            System.out.println("寫入: " + i.incrementAndGet());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }

    }

}

public class AtomicDemo {

    public static void main(String[] args) throws Exception {
        MyInt myInt = new MyInt();
        myInt.start();
        while (true) {            
            System.out.println("讀取: " + myInt.i.get());
            Thread.sleep(1000);
        }
    }
}
