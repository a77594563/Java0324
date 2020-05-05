package com.study.d11.enums;

public enum USCurrency {
    PENNY(1),    // 一美分
    NICKLE(5),   // 五美分
    DIME(10),    // 十美分
    QUARTER(25); // 25美分
    
    private int value;
    // enum 建構子一律是 private
    private USCurrency(int value) {
        this.value = value;
    }
 
    public int getValue() {
        return value;
    }
}
