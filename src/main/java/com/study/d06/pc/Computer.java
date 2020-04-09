package com.study.d06.pc;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDriver hd;
    private int price;

    public Computer() {
    }

    public Computer(CPU cpu, Memory memory, HardDriver hd) {
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.price = ( cpu.getPrice() + memory.getPrice() + hd.getPrice() ) *3;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDriver getHd() {
        return hd;
    }

    public void setHd(HardDriver hd) {
        this.hd = hd;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer{" + "cpu=" + cpu + ", memory=" + memory + ", hd=" + hd + ", price=" + price + '}';
    }
    
    
}
