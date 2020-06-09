package com.study.d21;

public class Play {
    public static void main(String[] args) {
        Cookies cookies = new Cookies();
        Master master = new Master(cookies);
        Dog dog = new Dog(cookies);
        Thread t1 = new Thread(master, "主人");
        Thread t2 = new Thread(dog, "小狗");
        t1.start();
        t2.start();
    }
}
