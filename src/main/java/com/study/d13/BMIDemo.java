package com.study.d13;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BMIDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\main\\java\\com\\study\\d13\\data\\bmi.csv");
        Scanner sc = new Scanner(file).useDelimiter("\\A");
        String data = sc.next();
        //System.out.println(data);
        
        Map<String, Map<String, Double>> bmi_map = new HashMap<>();
        String[] rows = data.split("\n");
        
        String[] keys = rows[0].split(","); // 分析標頭
        for(int i=1;i<rows.length;i++) { // 分析內容
            String[] row = rows[i].split(","); // 分析每個欄位 (name,height,weight)
            Map<String, Double> value = new HashMap<>(); // 建立身高與體重的 map
            value.put(keys[1].trim(), Double.parseDouble(row[1])); // 身高
            value.put(keys[2].trim(), Double.parseDouble(row[2])); // 體重
            bmi_map.put(row[0], value); // 每個人的名字當作 key 值
        }
        //System.out.println(bmi_map);
        // 計算 bmi
        for(String name : bmi_map.keySet()) {
            double h = bmi_map.get(name).get("height");
            double w = bmi_map.get(name).get("weight");
            double bmi = w / Math.pow(h/100, 2);
            // 將 bmi 增加到集合中 (加值資料)
            bmi_map.get(name).put("bmi", bmi);
        }
        System.out.println(bmi_map);
        System.out.println(bmi_map.get("John"));
    }
}
