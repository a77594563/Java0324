package com.study.d19.thread;

public class Job2 extends Thread{
    
    @Override
    public void run(){
        work();
    }
    
    public void work(){
        String threadName = Thread.currentThread().getName(); //執行緒名字
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%s 發第 %d 張DM\n", threadName, i);
        }
    }
}
