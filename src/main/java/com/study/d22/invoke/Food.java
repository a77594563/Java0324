package com.study.d22.invoke;

import java.util.Random;
import java.util.concurrent.Callable;

public class Food implements Callable<String>{

    @Override
    public String call() throws Exception {
        int n = new Random().nextInt(2);
        return n == 1?"漢堡":"便當";
    }
    
}
