package com.study.d19.thread;

public class MultiThread2 {
    public static void main(String[] args) {
        Job1 job1 = new Job1(); // user thread
        Job2 job2 = new Job2(); // daemon thread
        job1.setName("John");
        job2.setName("Mary");
        job2.setDaemon(true);
        job1.start();
        job2.start();
    }
}