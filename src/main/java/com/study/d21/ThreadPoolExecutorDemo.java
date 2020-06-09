package com.study.d21;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
// 工作 : 取得幸運數字
class LuckyNumber implements Runnable {
    @Override
    public void run() {
        System.out.println(new Random().nextInt(100));
    }
}

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        //ExecutorService exec = Executors.newSingleThreadExecutor();
        //ExecutorService exec = Executors.newFixedThreadPool(5);
        for(int i=1;i<=100;i++) {
            exec.submit(new LuckyNumber());
        }
        System.out.println("執行緒數量: " + Thread.activeCount());
        exec.shutdown();
    }
}
