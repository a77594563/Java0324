package com.study.d19.thread;

public class MultiThread {
    public static void main(String[] args) {
        Job1 job1 = new Job1(); // user thread
        Job2 job2 = new Job2(); // user thread
        job1.setName("John");
        job2.setName("Mary");
        job1.start();
        job2.start();
    }
}