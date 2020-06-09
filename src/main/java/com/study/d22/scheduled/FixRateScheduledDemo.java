package com.study.d22.scheduled;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FixRateScheduledDemo {

    public static void main(String[] args) throws Exception {
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        System.out.println("停1秒後執行");
        String symbol = "JPYTWD=x";
        exec.scheduleAtFixedRate(new GetPrice2(symbol), 1, 2, TimeUnit.SECONDS);

    }
}
