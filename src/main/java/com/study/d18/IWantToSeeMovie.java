package com.study.d18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class IWantToSeeMovie {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("A班", "A.txt");
        map.put("B班", "B.txt");
        // 哪一班可以看限制級電影
        map.entrySet().forEach((e) -> {
            System.out.println(e.getKey() + " : " + pass(e.getValue()));
        });
        
        
    }
    
    public static boolean pass(String value){
        String baseUrl = "src\\main\\java\\com\\study\\d18\\";
        try {
            File file = new File(baseUrl + value);
            Scanner sc = new Scanner(file).useDelimiter("//a");
            String data = sc.next();
            String[] rows = data.split("\n");
            for (String age : rows) {
                Person person = new Person();
                person.setAge(Integer.parseInt(age.trim()));
                if ( person.getAge() == -1 ) {
                    return false;
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("檔案有問題, 原因: " + ex.getMessage());
        }
        return true;
    }
}
