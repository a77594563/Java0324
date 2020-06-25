package com.study.d26_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesCopyAndDelete {
    public static void main(String[] args) {
        Path source = Paths.get("src\\main\\java\\com\\study\\d26_nio\\data.txt");
        Path dest   = Paths.get("src\\main\\java\\com\\study\\d26_nio\\data2.txt");
        try {
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
            //Files.delete(source);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}

