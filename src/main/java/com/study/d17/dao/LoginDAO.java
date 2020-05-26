package com.study.d17.dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.study.d17.entity.Member;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginDAO {
    private static Member[] members;
    static {
        try {
            File file = new File("src\\main\\java\\com\\study\\d17\\db\\member.json");
            String json = new Scanner(file).useDelimiter("\\A").next();
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            members = gson.fromJson(json, Member[].class);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    public Member[] getMembers() {
        return members;
    }
    
    public Member getMemberByUsername(String username) {
        return Arrays.stream(members)
                .filter(m -> m.getUsername().equals(username))
                .findFirst()
                .get();
    }
}
