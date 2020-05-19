package com.study.d16;

import java.util.Scanner;

public class Propagate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入反轉字串: ");
        String s = sc.nextLine();
        try {
            reverse(s);
        } catch (Exception e) {
            System.out.println("發生錯誤: " + e.getMessage()
            );
        }finally{
            System.out.println("All done");
        }
    }
    public static String reverse(String s) throws Exception{
        if (s.length() == 0) {
            Exception e = new Exception("empty String");
            throw e;
        }
        String reverseStr = "";
        for (int i = s.length()-1; i >= 0 ; --i) {
            reverseStr += s.charAt(i);
        }
        return reverseStr;
    }
}
