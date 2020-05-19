package com.study.d16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\study\\d16\\numbers.txt");
        try {
            Scanner sc = new Scanner(file).useDelimiter("//a");
            String data = sc.next();
            int x = 500; // 分子
            String[] array = data.split("\n");
            for (String arr : array) {
                int y = Integer.parseInt(arr);
                if (y != 0) {
                    System.out.printf("%d / %d = %d\n", x, y, x/y);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("檔案有問題, 原因: " + ex.getMessage());
        }
    }
}
