package com.study.d22.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LottoMain {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new Lotto("Vincent"));
        exec.execute(new Lotto("Mary"));
        exec.shutdown();
    }
}
