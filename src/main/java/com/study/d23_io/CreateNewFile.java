package com.study.d23_io;

import java.io.File;

public class CreateNewFile {
    public static void main(String[] args) throws Exception{
        File file = new File("src/main/java/com/study/d23_io/Myfile.txt");
        // 檔案是否存在?
        if (!file.exists()) {
            // 建立新檔案
            boolean ok = file.createNewFile();
            if (ok) {
                System.out.println("檔案建立成功");
            }else{
                System.out.println("檔案建立失敗");
            }
        }else{
            System.out.println("檔案已建立");
        }
    }
}
