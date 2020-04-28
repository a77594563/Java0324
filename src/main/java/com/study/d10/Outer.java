package com.study.d10;

public class Outer {
    int x = 100;
    static int y = 200;
    class Inner{ // 一般內部類別(不可有 static 的成員)
        void print(){
            System.out.println("Hello Inner.");
            System.out.println(Outer.this.x); //可以使用外部物件成員
            System.out.println(Outer.y); //可以使用外部類別成員
            SInner.print(); //可以調用靜態(static)內部類別的類別成員
        }
    }
    
    static class SInner{ // 靜態(static)內部類別
        static void print(){
            System.out.println("Hello SInner.");
            //System.out.println(Outer.this.x); //不可使用 this
            System.out.println(Outer.y);
            //Inner.print(); //不可直接呼叫一般內部類別成員
        }
    }
}
