package com.study.d12;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        // LinkedList 快速新增修改元素, 但是搜尋比較慢
        List<Integer> list = new LinkedList();
        list.add(100);
        list.add(100);
        list.add(90);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        //透過 for-loo[ 尋訪每一個元素
        for (int i  =  0; i < list.size() ; i++) {
            int a = list.get(i);
            System.out.println(a);
        }
        
        ListIterator<Integer> iter = list.listIterator();
        while (iter.hasNext()) {
            //先抓 index 再抓值
            int idx = iter.nextIndex();
            Integer next = iter.next();
            System.out.printf("%d : %d\n", idx, next);
        }
        
        while (iter.hasPrevious()) {
            int idx = iter.previousIndex();
            Integer previous = iter.previous();
            System.out.printf("%d : %d\n", idx, previous);
        }
    }
}
