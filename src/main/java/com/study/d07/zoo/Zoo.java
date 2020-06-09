package com.study.d07.zoo;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("柴犬");
        dog.setLegs(4);
        System.out.printf("%s 有 %d 隻腳\n", dog.getName(), dog.getLegs());
        dog.eat();
        dog.move();
        
        Bird bird = new Bird();
        bird.setName("白文鳥");
        bird.setLegs(2);
        System.out.printf("%s 有 %d 隻腳\n", bird.getName(), bird.getLegs());
        bird.eat();
        bird.move();
        
        Fish fish = new Fish();
        fish.setName("金魚");
        fish.setLegs(0);
        System.out.printf("%s 有 %d 隻腳\n", fish.getName(), fish.getLegs());
        fish.eat();
        fish.move();
    }
}
