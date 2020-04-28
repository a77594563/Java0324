package com.study.d10;

@FunctionalInterface // interface 裡面只有一種方法
public interface CheckScore {
    boolean isPass(int score);
}
