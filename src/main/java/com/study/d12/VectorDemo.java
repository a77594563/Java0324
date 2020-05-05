package com.study.d12;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(41, 5); // (起始空間數量, 空間數量一次增加數量)
        for (int i = 1; i <= 41; i++) { // 若資料超過原先空間數量 預設會以原數量兩倍增加
            v.add(i);
        }
        v.add(42);
        System.out.println("size: " + v.size()); // 有使用的元素個數
        System.out.println("capacity: " + v.capacity()); // 空間數量
    }
}
