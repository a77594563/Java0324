package com.study.d01;

import java.util.stream.Stream;

public class BMIDemo {
    public static void main(String[] args) {
        BMI b1 = new BMI();
        b1.name = "John"; b1.h = 170; b1.w = 60;
        BMI b2 = new BMI();
        b2.name = "Tom"; b2.h = 180; b2.w = 52;
        BMI b3 = new BMI();
        b3.name = "Mary"; b3.h = 150; b3.w = 45;
        
        System.out.printf("%s: %.2f, %s: %.2f, %s: %.2f\n"
                , b1.name, b1.getBMI(), b2.name, b2.getBMI(), b3.name, b3.getBMI());
        
        //列出 BMI 正常的人 18 < bmi <= 23
        System.out.println("------------BMI 正常---------");
        Stream.of(b1, b2, b3)
                .filter(b -> b.getBMI() > 18  && b.getBMI() <= 23)
                .forEach( b -> System.out.printf("%s: %.2f\n",b.name, b.getBMI()));
        //平均的 BMI 值
        double average = Stream.of(b1, b2, b3)
                .mapToDouble( d -> d.getBMI())
                .summaryStatistics()
                .getAverage();
        System.out.printf("平均bmi: %.2f", average);
    }
}
