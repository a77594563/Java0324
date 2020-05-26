package com.study.d17.service;

import com.study.d17.dao.LoginDAO;
import com.study.d17.entity.Member;
import com.study.d17.exception.LoginFailException;

public class LoginService {
    private LoginDAO dao = new LoginDAO();
    
    public boolean login(String username, String password) throws LoginFailException {
        Member[] members = dao.getMembers();
        for(Member m : members) {
            if(m.getUsername().equals(username) && m.getPassword().equals(password)) {
                return true;
            }
        }
        LoginFailException ex = new LoginFailException("登入失敗");
        throw ex;
    }

    public Member loginAndMember(String username, String password) throws LoginFailException {
        if(login(username, password)) {
            Member member = dao.getMemberByUsername(username);
            return member;
        }
        return null;
    }
    
}
