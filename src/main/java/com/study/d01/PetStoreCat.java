package com.study.d01;

public class PetStoreCat {
    public static void main(String[] args) {
        // 我有 2 隻貓
        Cat cat1 = new Cat();
        cat1.color = "棕";
        cat1.name = "波絲貓";
        cat1.price = 30000;
        
        Cat cat2 = new Cat();
        cat2.color = "黑";
        cat2.name = "小胖貓";
        cat2.price = 50000;
        
        System.out.printf("我有一隻 %s 色的 %s 價格是 %,d\n", cat1.color, cat1.name, cat1.price);
        cat1.skill();
        System.out.printf("我有一隻 %s 色的 %s 價格是 %,d\n", cat2.color, cat2.name, cat2.price);
        cat2.skill();
    }
}
