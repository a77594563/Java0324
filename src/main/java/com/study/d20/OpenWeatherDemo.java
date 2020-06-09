package com.study.d20;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
// 放置天氣的資料物件
class Weather {
    public double temp; // 溫度
    public double feelsLike; // 體感溫度
    public double humidity; // 濕度
    public String description; // 天氣描述
}
// 取得天氣資料的執行緒工作
class WeatherCallable implements Callable<Weather> {
    private String city;
    private String urlstring = "https://api.openweathermap.org/data/2.5/weather?q=%s,tw&appid=fcc57465b76d35357c84e4e30fe2431a";
    public WeatherCallable(String city) {
        this.city = city;
        urlstring = String.format(urlstring, city);
    }
    @Override
    public Weather call() throws Exception {
        URL url = new URL(urlstring);
        String json = new Scanner(url.openStream()).useDelimiter("\\A").next();
        System.out.println(json);
        // 1. 分析 json
        JsonElement jsonElement = JsonParser.parseString(json);
        String description = jsonElement
                            .getAsJsonObject()
                            .getAsJsonArray("weather")
                            .get(0)
                            .getAsJsonObject()
                            .get("description")
                            .getAsString();
        
        double temp = jsonElement
                        .getAsJsonObject()
                        .getAsJsonObject("main")
                        .get("temp")
                        .getAsDouble();
        
        double feelsLike = jsonElement
                        .getAsJsonObject()
                        .getAsJsonObject("main")
                        .get("feels_like")
                        .getAsDouble();
        
        double humidity = jsonElement
                        .getAsJsonObject()
                        .getAsJsonObject("main")
                        .get("humidity")
                        .getAsDouble();
        
        Weather weather = new Weather();
        weather.description = description;
        weather.temp = temp - 273.15;
        weather.feelsLike = feelsLike - 273.15;
        weather.humidity = humidity;
        return weather;
    }
}

public class OpenWeatherDemo {
    public static void main(String[] args) throws Exception {
        WeatherCallable wc = new WeatherCallable("Taipei");
        FutureTask<Weather> task = new FutureTask<>(wc);
        Thread t = new Thread(task);
        t.start();
        Weather weather = task.get();
        System.out.printf("天氣描述: %s\n氣溫: %.1f\n體感: %.1f\n濕度: %.1f\n",
                weather.description, weather.temp, weather.feelsLike, weather.humidity);
    }
}
