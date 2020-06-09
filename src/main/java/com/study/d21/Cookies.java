package com.study.d21;

public class Cookies {
    private boolean empty = true; // 預設盤子是空的
    
    public synchronized void put(int no) { // 放餅乾
        while(!empty) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.printf("主人放了第 %d 塊餅乾\n", no);
        empty = false; // 盤子上已有餅乾
        notifyAll(); // 喚醒正在 wait 的執行緒
    }
    
    public synchronized void eat(int no) { // 吃餅乾
        while(empty) {
            try {
                wait(); // 等待...
            } catch (Exception e) {
            }
        }
        System.out.printf("小狗吃了第 %d 塊餅乾\n", no);
        empty = true; // 盤子已空
        notifyAll(); // 喚醒正在 wait 的執行緒
    }
}
