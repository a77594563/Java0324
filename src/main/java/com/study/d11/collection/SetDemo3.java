package com.study.d11.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<>();
        nums.add(10);
        nums.add(1);
        nums.add(5);
        nums.add(4);
        nums.add(7);
        nums.add(6);
        nums.add(9);
        System.out.println(nums);
    }
}
