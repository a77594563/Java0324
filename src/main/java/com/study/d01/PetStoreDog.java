package com.study.d01;

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
        
        //分析
        Dog[] dogs = { dog1, dog2};
        int sum = 0;
        for( Dog dog : dogs){
            System.out.printf("%s 價格: %,d\n", dog.name, dog.price);
            sum += dog.price;
        }
        System.out.printf("總共: %,d 平均: %,d\n", sum,sum/dogs.length);
    }
}
