package com.study.d23_io;

import java.io.File;

public class CreateNewDir {
    public static void main(String[] args) throws Exception{
        File file = new File("src/main/java/com/study/d23_io/temps");
        if (!file.exists()) {
            boolean ok = file.mkdir();
            System.out.println(ok?"資料夾建立成功":"資料夾建立失敗");
        }else{
            System.out.println("資料夾已存在");
        }
    }
}
