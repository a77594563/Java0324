package com.study.d06.pc;

public class PCStore {
    public static void main(String[] args) {
        CPU cpu = new CPU(2000, 8000);
        Memory memory = new Memory(32, 3000);
        HardDriver hd = new HardDriver(2000, 9000);
        Computer computer = new Computer(cpu, memory, hd);
        
        System.out.printf("一台配備有: \n%s\n%s\n%s\n價格: $%,d\n"
                            , cpu, memory, hd, computer.getPrice());
    }
}
