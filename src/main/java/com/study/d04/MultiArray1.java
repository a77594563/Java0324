package com.study.d04;

public class MultiArray1 {
    public static void main(String[] args) {
        int[][] scores = new int[3][3];
        //System.out.println(scores.length);
        //System.out.println(scores[0].length);
        //System.out.println(scores[1].length);
        System.out.println(scores);
        scores[0][0] = 1;
        scores[1][1] = 2;
        scores[2][0] = 1;
        scores[1][0] = 2;
        scores[1][2] = 1;
        scores[0][1] = 2;
        scores[2][1] = 1;
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
