package com.study.d21;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ShortTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "短工作完成";
    }
    
}

class LongTask implements Runnable {
    @Override
    public void run() {
        System.out.println("長工作開始");
        try {
            // 工作進行中...
            TimeUnit.SECONDS.sleep(5);
        } catch (Exception e) {
        }
        System.out.println("長工作完成");
    }
}

public class ThreadPoolExecutorDemo2 {
    public static void main(String[] args) throws Exception {
        long begin = new Date().getTime();
        ExecutorService exec = Executors.newFixedThreadPool(2);
        
        String s1 = exec.submit(new ShortTask()).get();
        System.out.println(s1);
        
        String s2 = exec.submit(new ShortTask()).get();
        System.out.println(s2);
        
        Object obj = exec.submit(new LongTask()).get(); // null
        System.out.println("obj: " + obj);
        
        String s3 = exec.submit(new ShortTask()).get();
        System.out.println(s3);
        
        exec.shutdown();
        // 監控執行緒池的運作
        while(!exec.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("仍有工作在執行...");
        }
        System.out.println("所有工作執行完畢");
        long end = new Date().getTime();
        System.out.printf("執行時間: %.2f\n", (end-begin)/1000.0);
    }
}
