package com.study.d05;

import java.util.Scanner;

public class ScannerDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner("John 100 Mary 90.5").useDelimiter("\\a"); // "\\a"全部抓
        
        System.out.println(sc.next());

        
    }
}
