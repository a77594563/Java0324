package com.study.d24_io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.Date;

public class SetOut {

    public static void main(String[] args) {
        // 將 System.out 輸出的地方改為檔案 File → log.txt
        File file = new File("src\\main\\java\\com\\study\\d24_io\\log.txt");

        try (
                PrintStream out = new PrintStream(file);) {
            System.setOut(out);
            System.out.println(new Date());
            System.out.println(new Date());
            System.out.println(new Date());
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
