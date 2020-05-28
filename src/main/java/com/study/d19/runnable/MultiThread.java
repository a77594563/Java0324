package com.study.d19.runnable;

public class MultiThread {
    public static void main(String[] args) {
        Job1 job1 = new Job1();
        Job2 job2 = new Job2();
        
        Thread t1 = new Thread(job1, "小明");
        t1.start();
    }
}
