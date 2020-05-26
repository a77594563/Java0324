package com.study.d17;

import com.study.d17.exception.LoginFailException;
import com.study.d17.service.LoginService;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginPage {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入 username : ");
        String username = sc.next();
        System.out.print("請輸入 password : ");
        String password = sc.next();
        try {
            boolean check = service.login(username, password);
            if(check) {
                System.out.println("登入成功");
            }
        } catch (LoginFailException ex) {
            System.out.println(ex);
        }
        
    }
}
