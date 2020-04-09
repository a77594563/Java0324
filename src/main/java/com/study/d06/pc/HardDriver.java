package com.study.d06.pc;

public class HardDriver {
    private int capacity; //G
    private int price;

    public HardDriver() {
    }

    public HardDriver(int capacity, int price) {
        this.capacity = capacity;
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "HardDriver{" + "capacity=" + capacity + ", price=" + price + '}';
    }
    
}
