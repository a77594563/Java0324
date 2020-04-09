package com.study.d06.youbike;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception{
        String url = "https://data.tycg.gov.tw/api/v1/rest/datastore/a1b4714b-3b75-4ff8-a8f2-cc377e4eaa0f?format=json&limit=400";
        Reader reader = new InputStreamReader(new URL(url).openStream(), "UTF-8");
        JsonElement je = JsonParser.parseReader(reader);
        String json = je.getAsJsonObject().getAsJsonObject("result").getAsJsonArray("records").toString();
        //System.out.println(json);
        Youbike[] youbikes = new Gson().fromJson(json, Youbike[].class);
        Stream.of(youbikes)
                .forEach(y -> {
                    double km = getDistance(24.989918, 121.312040, Double.parseDouble( y.getLat() ), Double.parseDouble( y.getLng() ) ) / 1000;
                    y.setKm(km);
                });
        
        Stream.of(youbikes)
                .filter(y -> Integer.parseInt( y.getSbi() ) >= 20)
                .filter(y -> Integer.parseInt( y.getBemp() ) >= 20)
                .filter(y -> y.getKm() < 0.5)
                .forEach(System.out::println);
    }
    
    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    public static double getDistance(double lat1, double lng1, double lat2, double lng2) {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
                + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
        s = s * 6371.393;
        s = Math.round(s * 1000);
        return s;
    }
}
