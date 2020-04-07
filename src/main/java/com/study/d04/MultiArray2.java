package com.study.d04;

public class MultiArray2 {
    public static void main(String[] args) {
        int[][] scores = new int[3][];
        scores[0] = new int[3];
        scores[1] = new int[1];
        scores[2] = new int[2];
        print(scores);
    }
    public static void print(int [][] datas) {
        for(int i=0;i<datas.length;i++) {
            for(int k=0;k<datas[i].length;k++) {
                System.out.print(datas[i][k] + ", ");
            }
            System.out.println();
        }
    }
}
