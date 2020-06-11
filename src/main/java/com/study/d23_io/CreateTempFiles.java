package com.study.d23_io;

import java.io.File;

public class CreateTempFiles {
    public static void main(String[] args) throws Exception{
        File dir = new File("src/main/java/com/study/d23_io/temps");
        File tempFile = File.createTempFile("temp", ".txt", dir);
        System.out.println(tempFile.exists());
    }
}
