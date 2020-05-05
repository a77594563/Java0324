package com.study.d11.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set subject = new HashSet(); // 科目
        subject.add("國文"); // String
        subject.add("數學"); // String
        subject.add(100);   // Integer
        subject.add("英文"); // String
        System.out.println(subject);
        
        Iterator iter = subject.iterator(); // 尋訪器
        while (iter.hasNext()) {
            Object next = iter.next();
            if(next instanceof Integer) {
                iter.remove();
            } else {
                System.out.println(next);
            }
        }
        System.out.println(subject);
    }
}
