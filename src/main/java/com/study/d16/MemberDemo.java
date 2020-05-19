package com.study.d16;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Scanner;

public class MemberDemo {
    public static void main(String[] args) {
        try {
            boolean loginCheck = login("jo", "1234");
            System.out.println("loginCheck: " + loginCheck);
        } catch (FileNotFoundException ex) {
            System.out.println("檔案找不到");
        } catch(Exception e){
            System.out.println("登入錯誤訊息: " + e.getMessage());
        }
    }
    
    public static boolean login(String username, String password) throws FileNotFoundException, Exception {
        isMember(username);
        isActive(username);
        isExpired(username);
        checkUsernameAndPassowrd(username, password);
        return true;
    }
    
    public static boolean isMember(String username) throws FileNotFoundException, Exception {
        JsonArray ja = getJsonArray();
        for(int i=0;i<ja.size();i++) {
            JsonObject jo = ja.get(i).getAsJsonObject();
            if(jo.get("username").getAsString().equals(username)) {
                return true;
            }
        }
        Exception e = new Exception("無此會員, 請先加入 !");
        throw e;
    }
    
    public static boolean isActive(String username) throws FileNotFoundException, Exception {
        JsonArray ja = getJsonArray();
        for(int i=0;i<ja.size();i++) {
            JsonObject jo = ja.get(i).getAsJsonObject();
            if(jo.get("username").getAsString().equals(username) && !jo.get("active").getAsBoolean()) {
                Exception e = new Exception(username + "是黑名單");
                throw e;
            }
        }
        return true;
        
    }
    
    public static boolean isExpired(String username) throws FileNotFoundException, Exception {
        JsonArray ja = getJsonArray();
        for(int i=0;i<ja.size();i++) {
            JsonObject jo = ja.get(i).getAsJsonObject();
            if(jo.get("username").getAsString().equals(username)) {
                String expired = jo.get("expired").getAsString();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date expiredDate = sdf.parse(expired);
                Date today = new Date();
                if(expiredDate.getTime() < today.getTime()){
                    Exception e = new Exception(username + " 會員資格已於" + sdf.format(expiredDate) + "到期");
                    throw e;
                }
            }
        }
        return false;
        
    }
    
    public static boolean checkUsernameAndPassowrd(String username, String password) throws FileNotFoundException, Exception {
        JsonArray ja = getJsonArray();
        for(int i=0;i<ja.size();i++) {
            JsonObject jo = ja.get(i).getAsJsonObject();
            if(jo.get("username").getAsString().equals(username) && 
                    jo.get("password").getAsString().equals(password)) {
                return true;
            }
        }
        Exception e = new Exception("登入錯誤, 請重新登入 !");
        throw e;
        
    }
    
    public static JsonArray getJsonArray() throws FileNotFoundException{
        File file = new File("src\\main\\java\\com\\study\\d16\\member.json");
        Scanner sc = new Scanner(file).useDelimiter("\\A");
        String json = sc.next();
        JsonArray ja = JsonParser.parseString(json).getAsJsonArray();
        return ja;
    }
}
