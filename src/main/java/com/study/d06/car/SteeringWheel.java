package com.study.d06.car;

//方向盤
public class SteeringWheel {
    private String name;
    private int price;
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" + "name=" + name + ", price=" + price + '}';
    }
    
    
}
