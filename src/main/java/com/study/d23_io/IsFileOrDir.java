package com.study.d23_io;

import java.io.File;

public class IsFileOrDir {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/study/d23_io/Myfile.txt");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}
