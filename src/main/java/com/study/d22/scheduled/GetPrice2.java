package com.study.d22.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

// 取得金融商品報價
public class GetPrice2 implements Runnable{
    private String symbol; // 商品代號 : 例如 2330.TW

    public GetPrice2(String symbol) {
        this.symbol = symbol;
    }
    
    @Override
    public void run() {
        Stock stock;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String begin = sdf.format(new Date());
            stock = YahooFinance.get(symbol);
            int ms = new Random().nextInt(2500);
            Thread.sleep(ms);
            String finish = sdf.format(new Date());
            double price = stock.getQuote().getPrice().doubleValue();
            String name = stock.getName();
            System.out.printf("symbol: %s(%s) price: %.2f 開始時間: %s 查詢時間: %d ms 結束時間: %s\n", symbol, name, price, begin, ms, finish);
        } catch (Exception ex) {
            
        }
        
    }
    
}
