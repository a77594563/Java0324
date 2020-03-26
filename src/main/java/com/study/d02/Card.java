package com.study.d02;

public class Card {
    private String name; //信用卡的名稱
    private int number; //信用卡卡號(5碼)
    private int balance; //信用額度

    public Card() {
    }

    public Card(String name, int number, int balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card{" + "name=" + name + ", number=" + number + ", balance=" + balance + '}';
    }
    
    
}
