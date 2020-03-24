package com.study.d01;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class PetStoreDog {
    public static void main(String[] args) {
        //我有兩隻狗
        Dog dog1 = new Dog();
        dog1.color = "白";
        dog1.name = "拉不拉多犬";
        dog1.price = 30000;
        
        Dog dog2 = new Dog();
        dog2.color = "黑";
        dog2.name = "台灣土狗";
        dog2.price = 50000;
        
        System.out.printf("我有一隻 %s 色的 %s 價格是 %,d\n", dog1.color, dog1.name, dog1.price);
        dog1.skill();
        System.out.printf("我有一隻 %s 色的 %s 價格是 %,d\n", dog2.color, dog2.name, dog2.price);
        dog2.skill();
        System.out.println("------------------------------------------");
        
        Dog[] dogs = { dog1, dog2};
        int sum = 0;
        //分析 Java7(命令式)
        for( Dog dog : dogs){
            System.out.printf("%s 價格: %,d\n", dog.name, dog.price);
            sum += dog.price;
        }
        System.out.printf("總共: %,d 平均: %,d\n", sum,sum/dogs.length);
        
        System.out.println("------------------Java8--------------------");
        //分析 Java8(申明式)
        //建立串流 stream
        //分析串流資料
        //利用forEach 印出所有資料
        Stream.of(dogs)
                .filter(d -> d.price > 40000)
                .forEach( d -> System.out.printf("%s 價格: %,d\n", d.name, d.price) );
        IntSummaryStatistics stat = Stream.of(dogs)
                .mapToInt(d -> d.price)
                .summaryStatistics();
        System.out.println(stat);
    }
}
