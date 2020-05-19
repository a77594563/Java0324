package com.study.d16;

public class TryCatchDemo3 {

    public static void main(String[] args) {
        int x = 500; // 分子
        Integer[] ys = {10, 20, 0, 40, null, 60}; // 分母

        // 請求 x / y 結果, 程式執行完畢要顯示"做完了", 但只要遇到錯誤就結束程式
        try {
            for (Integer y : ys) {
                System.out.printf("%d / %d = %d\n", x, y, x / y);
            }
        } catch (Exception e) {
            System.out.println("遇到錯誤 : " + e.getMessage());
            return;
        } finally {
            System.out.println("做完了");
        }
    }

}
