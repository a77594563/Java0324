package com.study.d24_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class BMIReadFromFile {
    public static void main(String[] args) {
        String userName = "Mary";
        // 讀取序列化檔案資料
        File file = new File("src/main/java/com/study/d24_io/" + userName + ".bin");
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis); ){
            Object obj = ois.readObject();
            if(obj instanceof BMI){
                BMI bmi = (BMI)obj;
                System.out.printf("身高: %.1f 體重: %.1f BMI: %.2f\n", bmi.getH(), bmi.getW(), bmi.getBmi());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
