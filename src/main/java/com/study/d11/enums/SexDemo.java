package com.study.d11.enums;

public class SexDemo {
    public static void main(String[] args) {
        play(Sex.男);
        play(Sex.女);
    }
    public static void play(Sex sex) {
        switch(sex) {
            case 男:
                System.out.println("男生要進9球");
                break;
            case 女:
                System.out.println("女生要進7球");
                break;
        }
    }
}
