package com.study.d23_io;

class Foo implements AutoCloseable {
    public Foo() {
        System.out.println("Foo 建立");
    }
    public void play() {
        System.out.println("Foo 執行...");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Foo 關閉");
    }
}

class Bar implements AutoCloseable{
    public Bar() {
        System.out.println("Bar 建立");
    }
    public void play(){
         System.out.println("Bar 執行...");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Bar 關閉");
    }
    
}
public class AutoCloseableDemo {
    public static void main(String[] args) {
        try (Bar bar = new Bar();
             Foo foo = new Foo();){ // 後建立的先關閉
            
            bar.play();
            foo.play();
        } catch (Exception e) {
        }
    }
}
