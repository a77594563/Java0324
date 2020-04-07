package com.study.d05;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.util.Scanner;

public class MaskDemo {
    public static void main(String[] args) throws Exception{
        File file = new File("src\\main\\java\\com\\study\\d05\\mask.json");
        String json = getJson(file);
        //System.out.println(json);
        //抓取第一筆資料
        JsonElement je = JsonParser.parseString(json); // 整體 Json 元素
        JsonObject root = je.getAsJsonObject(); // Json 跟物件
        JsonArray array = root.getAsJsonArray("features");
        JsonObject first = array.get(0).getAsJsonObject();
        System.out.println(first);
        JsonObject properties = first.getAsJsonObject("properties");
        String name = properties.get("name").getAsString();
        System.out.println(name);
        int mask_adult = properties.get("mask_adult").getAsInt();
        int mask_child = properties.get("mask_child").getAsInt();
        System.out.printf("%s adult: %d, child: %d\n", name, mask_adult, mask_child);
    }
    
    //取的 Json 字串
    public static String getJson(File file) throws Exception{
        Scanner sc = new Scanner(file,"UTF-8").useDelimiter("\\A");
        return sc.next();
    }
}
