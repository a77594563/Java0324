package com.study.d19.lab;

class Father extends Thread{

    @Override
    public void run() {
        System.out.println("爸爸下班回家");
        System.out.println("爸爸準備洗熱水澡");
        System.out.println("爸爸發現沒瓦斯了");
        System.out.println("爸爸打電話叫瓦斯");
        Worker worker = new Worker();
        worker.start();
        try {
            worker.join(10_000);
        } catch (InterruptedException ex) {
        }
        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸洗完澡了");
    }
    
    
}

class Worker extends Thread{

    @Override
    public void run() {
        final String RED = "\u001B[31m";
        System.out.println(RED + "瓦斯工人送瓦斯");
        for (int i = 1; i <= 50; i++) {
            try {
                Thread.sleep(1000);
                            System.out.printf(RED + "%d 秒鐘 ", i);
            } catch (InterruptedException ex) {
            }
        }
        System.out.println("\n" + RED + "瓦斯工人送到了");
    }
    
    
}
public class JoinDemo {
    public static void main(String[] args) {
        new Father().start();
    }
}
