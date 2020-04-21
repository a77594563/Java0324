package com.study.d07;

class Talk {
    void a(){
        b();
        c();
        d();
    }
    void b(){
        
    }
    static void c(){
        d();
        //a(); 錯誤
        Talk talk = new Talk();
        talk.a();
    }
    static void d(){
        
    }
}

// 類別成員與物件成員溝通法則
public class TalkPolicy {
    public static void main(String[] args) {
        Talk.c();
        Talk.d();
        
        Talk talk = new Talk();
        talk.a();
        talk.b();
    }
}
