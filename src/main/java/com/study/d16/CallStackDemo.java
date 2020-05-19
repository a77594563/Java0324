package com.study.d16;

public class CallStackDemo {
    public static void main(String[] args) {
        int y = 0;
        try {
            foo(y);
        } catch (Exception e) {
            System.out.println("main() 處理了, " + e.getMessage());
        }
    }
    
    public static void foo(int y) {
        try {
            bar(y);
        } catch (Exception e) {
            System.out.print("foo() 處理了, ");
            System.out.println("錯誤訊息: " + e.getMessage());
            System.out.println("錯誤字串: " + e);
            e.printStackTrace(System.out); // 在 System.out 上印出完整錯誤(錯誤在堆疊中的內容)
        }
    }
    
    public static void bar(int y) {
        System.out.println(500/y);
    }
}
