package com.study.d10;

public class CheckScoreMain {
    public static void main(String[] args) {
        CheckScore cs1 = (int score) -> {
            return score >= 60;
        };
        CheckScore cs2 = (score) -> score >= 60;
        System.out.println(cs2.isPass(60));
        
        int[] scores = {100, 90, 80, 70};
        CheckScore cs = (score) -> score >= 85;
        printPassScore(scores, cs);
        
        printPassScore(scores, (score) -> score >= 95);
    }
    
    public static void printPassScore(int [] scores, CheckScore cs) {
        for (int score : scores) {
            if (cs.isPass(score)) {
                System.out.println(score);
            }
        }
    }
}
