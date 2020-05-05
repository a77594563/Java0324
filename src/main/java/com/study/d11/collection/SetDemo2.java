package com.study.d11.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        // <> 泛型
        Set<Integer> score = new HashSet<>(); // 分數
        score.add(90);   // Integer
        score.add(100);   // Integer
        score.add(80);   // Integer
        System.out.println(score);
        Iterator<Integer> iter = score.iterator();
        int sum = 0;
        while (iter.hasNext()) {
            Integer next = iter.next();
            sum += next;
        }
        System.out.println(sum);
    }
}
