package com.study.d06.pc;

public class Memory {
    private int capacity; //G
    private int price;

    public Memory() {
    }

    public Memory(int capacity, int price) {
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
        return "Memory{" + "capacity=" + capacity + ", price=" + price + '}';
    }
    
}
