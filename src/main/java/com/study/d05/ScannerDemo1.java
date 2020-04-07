package com.study.d05;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner("John 100 Mary 90.5");
        
        System.out.println(sc.next());
        System.out.println(sc.nextInt());
        System.out.println(sc.next());
        System.out.println(sc.nextDouble());
        
    }
}
