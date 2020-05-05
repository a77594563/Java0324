package com.study.d11.enums;

public enum RedEnvelope {
    雙親(20000),
    老婆(10000),
    小孩(1000),
    親戚的小孩(500),
    朋友的小孩(200),
    陌生的小孩(0);

    private int money;
    private RedEnvelope(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }
}
