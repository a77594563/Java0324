package com.study.d06.food;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception{
        String url = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        Reader reader = new InputStreamReader( new URL(url).openStream(), "UTF-8" );
        JsonElement je = JsonParser.parseReader(reader);
        
        System.out.println(je.toString());
        
        //將 json 資料轉進 RiceFailure[] 陣列
        RiceFailure[] rfs = new Gson().fromJson(je.toString(), RiceFailure[].class);
        //Stream.of(rfs).forEach(System.out::println);
        
        // 查詢特定品名
        Stream.of(rfs)
                //.filter(r -> r.get品名().contains("冠軍"))
                .filter(r -> r.getTitle().contains("108"))
                .forEach(System.out::println);
                        
    }
}
