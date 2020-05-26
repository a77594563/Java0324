package com.study.d18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IWantToSeeMovie {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A班", "A.txt");
        map.put("B班", "B.txt");
        // 哪一般可以看限制級電影
        String data = "src\\main\\java\\com\\study\\d18\\%s";

        try {
            String A = String.format(data, map.get("A班"));
            File file = new File(A);
            Scanner sc = new Scanner(file).useDelimiter("//a");
        } catch (FileNotFoundException ex) {
            System.out.println("檔案有問題, 原因: " + ex.getMessage());
        }
        
        
    }
}
