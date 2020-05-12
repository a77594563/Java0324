package com.study.d13;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Predicate;

public class CarDemo {
    static Map<Car, Integer> map;
    static {
        Car car1 = new Car("Toyota", 2000, 60_0000);
        Car car2 = new Car("Benz", 3000, 120_0000);
        Car car3 = new Car("BMW", 2500, 220_0000);
        map = new TreeMap<>();
        map.put(car1, 100);
        map.put(car2, 50);
        map.put(car3, 15);
    }
    
    public static void main(String[] args) {
        System.out.println(map);
        // 請計算總資產價值 ?
        int sum = 0;
        for(Car car : map.keySet()) {
            sum += car.getPrice() * map.get(car); // 價格 * 數量
        }
        System.out.printf("sum= %,d\n", sum);
        
        // Java 8
        Predicate<Entry<Car, Integer>> filter_1 = e -> e.getKey().getPrice() > 100_0000;
        sum = map.entrySet()
                .stream()
                .filter(filter_1)
                .mapToInt(m -> m.getKey().getPrice() * m.getValue())
                .sum();
        System.out.printf("sum= %,d\n", sum);
                
        
    }
}
