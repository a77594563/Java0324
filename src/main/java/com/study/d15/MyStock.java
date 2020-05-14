package com.study.d15;

public class MyStock implements Comparable<MyStock>{
    private String symbol; //股票代號
    private int shares; // 買進數量
    private double cost; //買進成本

    public MyStock(String symbol, int shares, double cost) {
        this.symbol = symbol;
        this.shares = shares;
        this.cost = cost;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

   @Override
    public String toString() {
        return "MyStock{" + "symbol=" + symbol + ", shares=" + shares + ", cost=" + cost + '}';
    }

    @Override
    public int compareTo(MyStock o) {
        return symbol.compareTo(o.symbol);
    }
    
    //自行建立創造一個方法給排序使用
    public double getTotalCost(){
        return shares * cost;
    }
    
}
