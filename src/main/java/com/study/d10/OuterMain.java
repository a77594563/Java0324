package com.study.d10;

public class OuterMain {
    public static void main(String[] args) {
        // 一般內部類別實體建立
        Outer.Inner in = new Outer().new Inner();
        in.print();
        
        // 靜態內部類別建立
        Outer.SInner sin = new Outer.SInner(); // Sinner 因為是 static 類別, 所以不用 new
        sin.print();
    }
}
