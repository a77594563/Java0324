package com.study.d13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo2 {
    static Map<String, String> dict; // 字典
    static {
        dict = new HashMap<>();
        dict.put("book", "書");
        dict.put("ball", "球");
        dict.put("best", "最好的");
        dict.put("bee", "蜜蜂");
    }
    
    public static void main(String[] args) {
        System.out.println(dict);
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入要查詢的英文單字: ");
        String word = sc.next();
        for(String key : dict.keySet()) {
            if(key.equals(word)) {
                System.out.println(dict.get(key));
                break;
            }
        }
    }
}
