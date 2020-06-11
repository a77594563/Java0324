package com.study.d22.lock;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Lotto implements Runnable {

    private String name;
    static ReentrantLock lock = new ReentrantLock();

    public Lotto(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            lock.lock();
            for (int i = 0; i <= 5; i++) {
                int n = new Random().nextInt(100);
                System.out.printf("%s 拿第 %d 組的號碼 是 : %d\n", name, i, n);
            }
        } finally {
            lock.unlock();
        }
    }
}

