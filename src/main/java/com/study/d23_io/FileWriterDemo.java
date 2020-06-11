package com.study.d23_io;

import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args){
        File f = new File("src/main/java/com/study/d23_io/Myfile.txt");
        FileWriter fw  = null;
        try {
            fw = new FileWriter(f, false); // true: 不清空舊資料 false: 清空舊資料
            fw.write("ABC");
        } catch (Exception e) {
        }finally{
            if(fw != null){
                try {
                    fw.close();
                } catch (Exception e) {
                }
            }
        }
    }
}
