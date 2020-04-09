package com.study.d06.food;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception{
        String url = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        Reader reader = new InputStreamReader( new URL(url).openStream(), "UTF-8" );
        JsonElement je = JsonParser.parseReader(reader);
        
        System.out.println(je.toString());
    }
}
