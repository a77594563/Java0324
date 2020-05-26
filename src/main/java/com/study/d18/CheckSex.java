package com.study.d18;

public class CheckSex {
    public String getSexByID(String id){
        char sex = id.charAt(1); //判斷性別
        String str = null;
        switch(sex){
            case '1':
                str = "男生";
                break;
            case '2':
                str = "女生";
                break;
            default:
                assert false : "性別錯誤";
        }
        
        return str;
    }
}
