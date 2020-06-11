package com.study.d23_io;

import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo2 {
    public static void main(String[] args){
        File f = new File("src/main/java/com/study/d23_io/Myfile.txt");
        
        try(FileWriter fw = new FileWriter(f, true)) { // 任何有實作 AutoCloseable 都可如此使用 → 自動close
            fw.write("ABC");
        } catch (Exception e) {
        }
    }
}
