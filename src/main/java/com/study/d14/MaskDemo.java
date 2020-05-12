package com.study.d14;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URL;
import java.util.Scanner;

public class MaskDemo {
    public static void main(String[] args) throws Exception{
        String path = "https://raw.githubusercontent.com/kiang/pharmacies/master/json/points.json";
        URL url = new URL(path);
        Scanner sc  = new Scanner(url.openStream(), "UTF-8").useDelimiter("\\a");
        String json = sc.next();
        
        JsonElement je = JsonParser.parseString(json); // 整體 Json 元素
        JsonObject root = je.getAsJsonObject(); // Json 根物件
        JsonArray array = root.getAsJsonArray("features");
        
        // Java 8
        array.forEach(jo -> {
            JsonObject properties = jo.getAsJsonObject().getAsJsonObject("properties");
            String name = properties.get("name").getAsString();
            String county = properties.get("county").getAsString();
            String town = properties.get("town").getAsString();
            int mask_adult = properties.get("mask_adult").getAsInt();
            int mask_child = properties.get("mask_child").getAsInt();

            if(county.equalsIgnoreCase("桃園市") && town.equalsIgnoreCase("大園區")){
                System.out.printf("%s[%s, %s] adult: %d, child: %d\n", name, county, town, mask_adult, mask_child);
            }
                });
    }
}
