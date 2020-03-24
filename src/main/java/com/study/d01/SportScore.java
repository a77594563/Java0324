package com.study.d01;

import java.util.stream.DoubleStream;

public class SportScore {
    public static void main(String[] args) {
        DoubleStream scores = getScores();
        System.out.printf("平均值: %.2f\n", scores.average().getAsDouble());
        
        //標準差
        double avg = getScores().average().getAsDouble();
        double sum1 = getScores().map(d -> Math.pow( (d-avg), 2 )).sum();
        long n = getScores().count();
        double sd = Math.sqrt(sum1/n);
        System.out.printf("標準差: %.2f\n", sd);
        
        //變異係數
        double cv = sd / avg;
        System.out.printf("變異係數: %.2f\n", cv);
    }
    
    private static DoubleStream getScores(){
        return DoubleStream.of(5.3, 7.8, 9.0, 10.0, 3.5, 6.7, 9.9);
    }
}
