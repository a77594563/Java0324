package com.study.d03.array;

public class ArrayDemo6 {
    public static void main(String[] args) {
        String s = "She sells seashell by the Seashore";
        System.out.printf("%d 個字元\n", s.length());
        String[] sArray = s.split(" ");
        //System.out.println(sArray[0]);
        System.out.printf("%d 個字\n", sArray.length);
        
        int sum = 0;
        for (char c : s.toCharArray()) {
            if(c == 's' || c == 'S'){
                sum++;
            }
        }
        System.out.println("");
        System.out.printf("總共有 %d 個s\n", sum);
        
        //Java 8 
        long sum2 = s.chars().filter(x -> x == (int)'s' || x == (int)'S').count();
        System.out.printf("總共有 %d 個s\n", sum2);
    }
}
