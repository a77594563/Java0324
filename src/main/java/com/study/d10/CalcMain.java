package com.study.d10;

public class CalcMain {
    public static void main(String[] args) {
        Calc calc = new Calc() {
            @Override
            public void action(int x, int y) {
                System.out.println(x + y);
            }
        };
        calc.action(10, 20);
        
        Calc calc2 = new Calc() {
            @Override
            public void action(int x, int y) {
                System.out.println(x - y);
            }
        };
        calc2.action(10, 20);
    }
}
