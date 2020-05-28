package com.study.d19.runnable;

public class Job1 implements Runnable{

    @Override
    public void run(){
        work();
    }
    
    private void work(){
        String threadName = Thread.currentThread().getName(); //執行序名字
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%s 搬第 %d 本書\n", threadName, i);
        }
    }
    
}
