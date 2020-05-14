package com.study.d15;

import java.util.Comparator;
import java.util.stream.Stream;

public class MyStockDemo {
    public static void main(String[] args) {
        MyStock m1 = new MyStock("2330.TW", 5000, 300); //台積電
        MyStock m2 = new MyStock("2303.TW", 8000, 20); //聯電
        MyStock m3 = new MyStock("2317.TW", 9000, 100); //鴻海
        // 根據 symbol 進行排序
        Stream.of(m1, m2, m3).sorted().forEach(System.out::println);   
        //跟續 總成本 shares * cost 來排序
        Stream.of(m1, m2, m3)
                .sorted(new Comparator<MyStock>() {
                    @Override
                    public int compare(MyStock o1, MyStock o2) {
                        return (int)((o1.getShares() * o1.getCost()) - (o2.getShares() * o2.getCost()));
                    }
                }).forEach(System.out::println);

        Stream.of(m1, m2, m3)
                .sorted(
                    (MyStock o1, MyStock o2) -> (int)((o1.getShares() * o1.getCost()) - (o2.getShares() * o2.getCost()))
                ).forEach(System.out::println);
        
        
        Stream.of(m1, m2, m3)
                .sorted(Comparator.comparing(MyStock::getTotalCost))
                .forEach(System.out::println);
        
        
    }
}
