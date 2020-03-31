package com.study.d03.array;

import java.util.Random;
import java.util.stream.Stream;

public class ArrayDemo4 {

    public static void main(String[] args) {
        int[] lottos = new int[6];
        for (int lotto : lottos) {
            while (true) {
                int n = new Random().nextInt(10) + 1;
                //確認 n 值是否已存在 lottos陣列中
                if (!exist(n, lottos)) {
                    lotto = n;
                    break;
                } else {
                    continue;
                }
            }
            System.out.print(lotto + ", ");
        }
        System.out.println();

    }

    public static boolean exist(int n, int[] lottos) {
        boolean flag = false;
        for (int lotto : lottos) {
            if (lotto == n) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
