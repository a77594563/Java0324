package com.study.d05;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.net.URL;
import java.util.Scanner;

public class MaskDemo5 {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://raw.githubusercontent.com/kiang/pharmacies/master/json/points.json");
        String json = getJson(url);
        //System.out.println(json);
        //抓取所有資料 name adult child
        JsonElement je = JsonParser.parseString(json); // 整體 Json 元素
        JsonObject root = je.getAsJsonObject(); // Json 跟物件
        JsonArray array = root.getAsJsonArray("features");
        
        int mask_adult_sum = 0;
        int mask_child_sum = 0;
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
    public static String getJson(URL url) throws Exception{
        Scanner sc = new Scanner(url.openStream(),"UTF-8").useDelimiter("\\A");
        return sc.next();
    }
}
