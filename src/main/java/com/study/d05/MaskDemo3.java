package com.study.d05;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.util.Scanner;

public class MaskDemo3 {
    public static void main(String[] args) throws Exception{
        File file = new File("src\\main\\java\\com\\study\\d05\\mask.json");
        String json = getJson(file);
        //System.out.println(json);
        //抓取所有資料 name adult child
        JsonElement je = JsonParser.parseString(json); // 整體 Json 元素
        JsonObject root = je.getAsJsonObject(); // Json 跟物件
        JsonArray array = root.getAsJsonArray("features");
        for(int i=0; i<array.size(); i++){
            JsonObject first = array.get(i).getAsJsonObject();
            JsonObject properties = first.getAsJsonObject("properties");
            String name = properties.get("name").getAsString();
            String county = properties.get("county").getAsString();
            String town = properties.get("town").getAsString();
            int mask_adult = properties.get("mask_adult").getAsInt();
            int mask_child = properties.get("mask_child").getAsInt();

            if(county.equalsIgnoreCase("桃園市") && town.equalsIgnoreCase("大園區")){
                System.out.printf("%s[%s, %s] adult: %d, child: %d\n", name, county, town, mask_adult, mask_child);
            }
        }
    }
    
    //取的 Json 字串
    public static String getJson(File file) throws Exception{
        Scanner sc = new Scanner(file,"UTF-8").useDelimiter("\\A");
        return sc.next();
    }
}
