package com.study.d01;

public class PetStoreBird {
    public static void main(String[] args) {
        // 我有 2 隻鳥
        Bird bird1 = new Bird();
        bird1.color = "彩";
        bird1.name = "鸚鵡";
        bird1.price = 30000;
        
        Bird bird2 = new Bird();
        bird2.color = "黃";
        bird2.name = "斑鳩";
        bird2.price = 50000;
        
        System.out.printf("我有一隻 %s 色的 %s 價格是 %,d\n", bird1.color, bird1.name, bird1.price);
        bird1.skill();
        System.out.printf("我有一隻 %s 色的 %s 價格是 %,d\n", bird2.color, bird2.name, bird2.price);
        bird2.skill();
    }
}
