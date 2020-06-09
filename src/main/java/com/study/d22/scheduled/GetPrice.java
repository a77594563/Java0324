package com.study.d22.scheduled;

import java.util.concurrent.Callable;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;



// 取得金融商品報價
public class GetPrice implements Callable<Double>{
    private String symbol; // 商品代號 : 例如 2330.TW

    public GetPrice(String symbol) {
        this.symbol = symbol;
    }
    
    
    @Override
    public Double call() throws Exception {
        Stock stock = YahooFinance.get(symbol);
        double price = stock.getQuote().getPrice().doubleValue();
        return price;
    }
    
}
