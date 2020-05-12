package com.study.d14;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class MyStockDemo {
    public static void main(String[] args) throws Exception {
        // 1. CSV 資料解析
        File file = new File("src\\main\\java\\com\\study\\d14\\BWIBBU_d.csv");
        Scanner sc = new Scanner(file,"UTF-8").useDelimiter("\\A"); //全選
        String data = sc.next();
//        System.out.println(data);
        String[] rows = data.split("\n"); //以斷行來分割每筆資料
        List<MyStock> myStocks = new ArrayList<>();
        for (String row : rows) {
            String [] stock = row.trim().replace("\"", "").split(",");
            if(stock.length == 7 && !stock[0].contains("證券代號")){
                //System.out.println(stock[0] + " " + stock[1] + " " + stock[2] + " " + stock[3] + " " + stock[4] + " " + stock[5] + " " + stock[6]);
                // 2. 匯入到 MyStock 物件中
                MyStock myStock  = new MyStock(stock[0],stock[1],stock[2],stock[3],stock[4],stock[5],stock[6]);
                // 3. 加入倒 myStocks 集合中
                myStocks.add(myStock);
            }
        }
        //System.out.println(myStocks);
        // 4. 進行資料分析
        Stream<MyStock> stream = myStocks.stream()
                .filter(ms -> !ms.本益比.equals("-") && Double.parseDouble(ms.本益比) < 10)
                .filter(ms -> !ms.殖利率.equals("-") && Double.parseDouble(ms.殖利率) > 7)
                .filter(ms -> !ms.股價淨值比.equals("-") && Double.parseDouble(ms.股價淨值比) < 1);
        // 4.1 將結果印出
        //stream.forEach(System.out::println);
        // 4.2 將所查到的結果儲存在新的集合中
        List<MyStock> results = stream.collect(toList());
        System.out.println(results);
        
    }
}
