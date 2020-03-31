package com.study.d03.array;

import java.util.Random;
import java.util.stream.Stream;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] lottos  = new int[6];
        for (int lotto : lottos) {
            lotto = new Random().nextInt(10)+1;
            System.out.println(lotto + ", ");
        }
       
        System.out.println();
                
    }
}
