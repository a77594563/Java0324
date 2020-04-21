package com.study.d08.zoo;

public class zoo4 {
    public static void main(String[] args) {
        Cat cat = new Tiger(); //型態為 Cat , 實體為 Tiger
        ((Animal)cat).cry(); //能轉成 Animal 的型態來呼叫方法, 不過實體依舊是Tiger
        ((Tiger)cat).hunter(); //轉成Tiger 型態就能夠呼叫 hunter 方法
    }
}
