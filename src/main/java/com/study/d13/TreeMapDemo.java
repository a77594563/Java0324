package com.study.d13;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(2, "Vincent");
        map.put(3, "Howard");
        map.put(1, "Helen");
        System.out.println(map);
    }
}
