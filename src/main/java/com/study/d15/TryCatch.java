package com.study.d15;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] nums = {5, 2, 0};
            int x = 10 / nums[3];
            System.out.println("計算結果: " + x);
        } catch (ArithmeticException e) {
            System.out.println("數學錯誤發生");
            System.out.println("錯誤訊息: " + e);
        } catch (Exception e){
            System.out.println("其他錯誤發生");
            System.out.println("錯誤訊息: " + e);
        }
        
        System.out.println("結束");
    }
}
