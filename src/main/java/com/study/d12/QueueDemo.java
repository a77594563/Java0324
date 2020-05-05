package com.study.d12;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("吃東西");
        q.offer("吞下去");
        q.offer("消化它");
        q.offer("拉出來");
        System.out.println(q);
        
        while (q.size() > 0) {            
            String data = q.poll();
            System.out.println("現在進行: " + data);
            System.out.println(q);
        }
        
    }
}
