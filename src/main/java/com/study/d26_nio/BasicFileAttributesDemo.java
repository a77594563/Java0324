package com.study.d26_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesDemo {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("C:\\Program Files\\ojdkbuild\\java-1.8.0-openjdk-1.8.0.232-1\\bin\\java.exe");
        BasicFileAttributes attr = 
                Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println(path);
        System.out.println("size:" + attr.size());
        System.out.println("isDirectory:" + attr.isDirectory());
        System.out.println("isRegularFile:" + attr.isRegularFile());
        System.out.println("isSymbolicLink:" + attr.isSymbolicLink());
        System.out.println("isOther:" + attr.isOther());
        System.out.println("lastAccessTime:" + attr.lastAccessTime());
        System.out.println("lastModifiedTime:" + attr.lastModifiedTime());        
        System.out.println("lastModifiedTime:" + Files.getLastModifiedTime(path));        
    }
}
