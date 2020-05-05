package com.study.d12;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入任意字串: ");
        String str = sc.nextLine();
        // 請利用 Stack 做出字串反轉 ex: Java -> avaJ
        char[] chars = str.toCharArray();
        Stack<Character> st = new Stack();
        for (char c : chars) {
            st.push(c);
        }

        while ( !st.isEmpty() ) {
            System.out.print(st.pop());
        }
        System.out.println();
    }
}
