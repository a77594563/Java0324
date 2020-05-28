package com.study.d19.thread;

public class SingleThread {
    public static void main(String[] args) {
        Job1 job1 = new Job1();
        Job2 job2 = new Job2();
        job1.work();
        job2.work();
    }
}
