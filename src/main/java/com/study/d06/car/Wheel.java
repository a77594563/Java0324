package com.study.d06.car;

public class Wheel {
    private String name;
    private double size;
    private int price;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wheel{" + "name=" + name + ", size=" + size + ", price=" + price + '}';
    }
    
    
}
