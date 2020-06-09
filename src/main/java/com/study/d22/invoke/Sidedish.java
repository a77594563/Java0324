package com.study.d22.invoke;

import java.util.Random;
import java.util.concurrent.Callable;

public class Sidedish implements Callable<String>{

    @Override
    public String call() throws Exception {
        int n = new Random().nextInt(2);
        return n == 1?"薯條":"沙拉";
    }
    
}
