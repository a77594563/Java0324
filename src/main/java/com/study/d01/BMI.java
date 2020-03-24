package com.study.d01;

public class BMI {
    String name; //名字
    double h ; //身高
    double w ; //體重
    double getBMI(){ // 取得BMI{計算BMI數值}
        double bmi = w/Math.pow(h/100, 2);
        return bmi;
    }
}
