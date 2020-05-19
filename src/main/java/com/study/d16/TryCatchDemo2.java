package com.study.d16;

public class TryCatchDemo2 {

    public static void main(String[] args) {
        int x = 500; // 分子
        Integer[] ys = {10, 20, 0, 40, null, 60}; // 分母

        for (Integer y : ys) {
            try {
                System.out.printf("%d / %d = %d\n", x, y, x / y);
            } catch (RuntimeException e) {
                System.out.println("錯誤發生, 可能原因: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("錯誤發生, 可能原因: " + e.getMessage());
            }
        }

    }
}
