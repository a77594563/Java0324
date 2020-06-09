package com.study.d20;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class FindLuckyNumber implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        int num = new Random().nextInt(100);
        return num;
    }
    
}

public class CallableDemo {
    public static void main(String[] args) throws Exception {
        // 1. 建立 Callable 物件
        FindLuckyNumber findLuckyNumber = new FindLuckyNumber();
        // 2. 將 Callable 物件裝載到 FutureTask
        FutureTask<Integer> task = new FutureTask<>(findLuckyNumber);
        // 3. 建立一個執行緒去執行
        Thread t = new Thread(task);
        t.start();
        // 4. 透過 get 取得資料
        int num1 = task.get();
        
        FindLuckyNumber findLuckyNumber2 = new FindLuckyNumber();
        FutureTask<Integer> task2 = new FutureTask<>(findLuckyNumber);
        Thread t2 = new Thread(task2);
        t2.start();
        int num2 = task2.get();
        
        System.out.printf("num1 = %d, num2 = %d, 總和 = %d\n", num1, num2, (num1 + num2));
    }
}
