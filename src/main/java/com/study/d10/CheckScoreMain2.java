package com.study.d10;

import java.util.function.Predicate;

public class CheckScoreMain2 {
    public static void main(String[] args) {
        int scores[] = { 100, 90, 80, 70};
        printPassScore(scores, (score) -> score >= 85);
    }
    public static void printPassScore(int [] scores, Predicate<Integer> p) {
        for (int score : scores) {
            if (p.test(score)) {
                System.out.println(score);
            }
        }
    }
}
