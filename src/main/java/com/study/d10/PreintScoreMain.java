package com.study.d10;

import java.util.function.Consumer;

public class PreintScoreMain {
    public static void main(String[] args) {
        int[] scores = {100, 90, 80, 70};
        print(scores, (score) -> System.out.println(score) );
        print(scores, (score) -> System.out.println(score*2) );
        print(scores, System.out::println );
    }
    
    
    public static void print(int[] scores, Consumer<Integer> c) {
        for (int score : scores) {
            c.accept(score);
        }
    }
}
