package com.study.d10;

public class CalcMain_Lambda {
    public static void main(String[] args) {
        // 傳統寫法
        Calc calc = new Calc() {
            @Override
            public void action(int x, int y) {
                System.out.println(x + y);
            }
        };
        calc.action(10, 20);
        
        // Java 8 Lambda
        Calc calc2 = (int x, int y) -> {
            System.out.println(x + y);
        };
        calc2.action(10, 20);
        
        Calc calc3 = (int x, int y) -> System.out.println(x + y);
        calc3.action(10, 20);
        
        Calc calc4 = (x, y) -> System.out.println(x + y);
        calc4.action(10, 20);
    }
    
}
