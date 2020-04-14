package com.study.d07.zoo;

public class zoo {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.setName("柴犬");
        d.setLegs(4);
        System.out.printf("%s 有 %d 隻腳\n", d.getName(), d.getLegs());
        d.eat();
        //d.play(); 不能實作
    }
}
