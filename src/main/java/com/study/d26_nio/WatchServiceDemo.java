package com.study.d26_nio;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class WatchServiceDemo {
    public static void main(String[] args) throws Exception {
    Path dir = Paths.get("C:/temp");
        WatchService ws = FileSystems.getDefault().newWatchService();
        dir.register(ws, 
                StandardWatchEventKinds.ENTRY_CREATE, 
                StandardWatchEventKinds.ENTRY_DELETE, 
                StandardWatchEventKinds.ENTRY_MODIFY);
        
        while(true) {
            System.out.println("系統監聽中...");
            WatchKey watchKey = ws.take();
            for (WatchEvent<?> event: watchKey.pollEvents()) {
                System.out.println("事件:" + event.kind().name() + ", "
                        + "資源:" + event.context().toString());
            }
            watchKey.reset();
        }
    }
}