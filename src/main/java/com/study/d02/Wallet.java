package com.study.d02;

public class Wallet {
    private int money;  //私有變數, 只有Wallet 自己可以"直接"使用
    
    Wallet() {
    }
    
    Wallet(int money) { // 建構子
        this.money = money; // 修改money 的資料
    }
    
    //設定 money
    void setMoney(int m){ // (封裝 money)
        if(m >= 0){
            money = m;
        }else{
            System.out.println("皮夾的錢不可 < 0");
        }
    }
    
    // 取得 money
    int getMoney(){
        return money;
    }
    
    // 印出皮夾內的資料
    void printWallet(){
        System.out.printf("我的皮夾裡有 $%,d\n", money);
    }
}
