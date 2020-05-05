package com.study.d12;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        IntStream.rangeClosed(1, 10).forEach(list::add);
        System.out.println(list);
        int sum = list.stream().mapToInt(i -> i).sum();
        System.out.println(sum);
        // 統計資料
        IntSummaryStatistics stats = list.stream().mapToInt(i -> i).summaryStatistics();
        System.out.println(stats);
        System.out.println(stats.getAverage());
        // 植樹總和 = ?
        sum = list.stream().mapToInt(i -> i)
                .filter( i -> isPrime(i))
                .sum();
        System.out.println(sum);
    }
    public static boolean isPrime(int n){
        return n > 1 && !IntStream.rangeClosed(2, n/2).anyMatch(i -> n % i == 0);
    }
}
