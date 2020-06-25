package com.study.d26_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesLines {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src\\main\\java\\com\\study\\d26_nio\\data.txt");
        Files.lines(path).forEach(System.out::println);
    }
}
