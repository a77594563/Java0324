package com.study.d15;

public class BMI implements Comparable<BMI>{
    private String name;
    private double height;
    private double weight;

    public BMI(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "BMI{" + "name=" + name + ", height=" + height + ", weight=" + weight + ", bmi=" + getBMI() + '}';
    }

    @Override
    public int compareTo(BMI o) {
        return name.compareTo(o.name);
    }
    
    public double getBMI(){
        return weight/Math.pow((height/100), 2);
    }
}
