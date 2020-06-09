package com.study.d22.scheduled;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class FixDelayScheduledDemo {

    public static void main(String[] args) throws Exception {
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        System.err.println("停1秒後執行");
        String symbol = "JPYTWD=x";
        exec.scheduleWithFixedDelay(new GetPrice2(symbol), 1, 2, TimeUnit.SECONDS);

    }
}
