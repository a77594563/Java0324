package com.study.d17;

import com.study.d17.entity.Member;
import com.study.d17.exception.LoginFailException;
import com.study.d17.service.LoginService;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginPage2 {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入 username : ");
        String username = sc.next();
        System.out.print("請輸入 password : ");
        String password = sc.next();
        try {
            Member member = service.loginAndMember(username, password);
            System.out.println(member);
        } catch (LoginFailException ex) {
            System.out.println(ex);
        }
        
    }
}
