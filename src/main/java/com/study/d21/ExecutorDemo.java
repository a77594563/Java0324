package com.study.d21;

import java.util.Random;
import java.util.concurrent.Executor;

// 工作 : 產生 Lotto 號碼
class Lotto implements Runnable {
    @Override
    public void run() {
        System.out.println(new Random().nextInt(100));
    }
}

// 執行工作的單位
class MyExecutor implements Executor {
    @Override
    public void execute(Runnable r) {
        // 如何執行 ?
        new Thread(r).start();
    }
}

public class ExecutorDemo {
    public static void main(String[] args) {
        MyExecutor executor = new MyExecutor();
        executor.execute(new Lotto());
        executor.execute(new Lotto());
        executor.execute(new Lotto());
        executor.execute(new Lotto());
        executor.execute(new Lotto());
    }
}
