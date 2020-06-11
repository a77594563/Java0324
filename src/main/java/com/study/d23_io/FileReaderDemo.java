package com.study.d23_io;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/study/d23_io/MyFile.txt");
        try (FileReader fr = new FileReader(file)){
            int data;
            while ( (data = fr.read()) != -1) {                
                System.out.print((char)data);
            }
            
        } catch (Exception e) {
        }
        
    }
}
