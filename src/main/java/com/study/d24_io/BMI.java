package com.study.d24_io;

import java.io.Serializable;

public class BMI implements Serializable{
    private double h;
    private transient double w; // 若此項是敏感資料,可用 transient ,此項將不會出會在序列化檔案裡
    private double bmi;

    public BMI() {
    }

    public BMI(double h, double w) {
        this.h = h;
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    @Override
    public String toString() {
        return "BMI{" + "h=" + h + ", w=" + w + ", bmi=" + bmi + '}';
    }
    
    
}
