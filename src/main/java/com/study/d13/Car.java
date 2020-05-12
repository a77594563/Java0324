package com.study.d13;

public class Car implements Comparable<Car>{
    private String name;
    private Integer cc;
    private Integer price;

    public Car(String name, Integer cc, Integer price) {
        this.name = name;
        this.cc = cc;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", cc=" + cc + ", price=" + price + '}';
    }

    @Override
    public int compareTo(Car o) {
        return price - o.price;
    }
    
}
