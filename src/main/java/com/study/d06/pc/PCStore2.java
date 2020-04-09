package com.study.d06.pc;

import java.util.stream.Stream;

public class PCStore2 {
    public static void main(String[] args) {
        Computer computer1 = new Computer(
                    new CPU(2000, 8000)
                  , new Memory(32, 3000)
                  , new HardDriver(2000, 9000));
        
        Computer computer2 = new Computer(
                    new CPU(2500, 9000)
                  , new Memory(16, 2500)
                  , new HardDriver(500, 2000));
        
        Computer computer3 = new Computer(
                    new CPU(3000, 16000)
                  , new Memory(64, 8000)
                  , new HardDriver(2000, 125000));
        
        Computer[] computers = {computer1, computer2, computer3};
        Stream.of(computers).forEach(System.out::println);
        
        // 請找出最貴的一台是多少錢
        int max = Stream.of(computers).mapToInt(c -> c.getPrice()).max().getAsInt();
        // 請找出最便宜的一台是多少錢
        int min = Stream.of(computers).mapToInt(c -> c.getPrice()).min().getAsInt();
        //請算出這三台的均價
        double avg = Stream.of(computers).mapToInt(c -> c.getPrice()).average().getAsDouble();
        
        System.out.printf("max: %,d, min: %,d, avg: %,.2f\n", max, min, avg);
    }
}
