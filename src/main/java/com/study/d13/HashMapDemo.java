package com.study.d13;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 40000);
        map.put("Mary", 50000);
        map.put("Tom", 60000);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("John"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        
        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
