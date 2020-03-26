package com.study.d02;

import java.util.Random;
import java.util.Scanner;

public class WalletGame {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        WalletGame game = new WalletGame();
        Wallet wallet = new Wallet(100);
        
        game.play(wallet);
    }
    
    void play(Wallet wallet){
        Scanner sc = new Scanner(System.in);
        do {            
            int bet = bet(wallet); //下注金額
            if (bet == 0)   break;
            
            guess(bet, wallet); //比大小
            
        } while (true);
    }
    
    //下注金額
    int bet(Wallet wallet){
            
            System.out.printf("目前餘額有 %,d\n", wallet.getMoney());
            System.out.println("請下注(若輸入 <= 0, 則離開程式): ");
            int bet = sc.nextInt(); //輸入下注金額
            if (bet <= 0 )  return 0; //離開程式
            
            if (bet > wallet.getMoney()) { //判斷皮夾餘額是否足夠
                System.out.printf("錢不夠, 皮夾餘額: %,d\n", wallet.getMoney());
                return bet(wallet);
            }else{
                return bet;
            }
            
            
    }
    
    //比大小
    void guess(int bet, Wallet wallet){
        int ans = new Random().nextInt(12) + 1; //1~12的亂數
        System.out.println("若猜比七大(含) 輸入: 1, 若猜比七小 輸入:2 ==>  ");
        int guess = sc.nextInt(); //取得使用者的選擇
        switch(guess){
                case 1: //猜測比七大
                    System.out.println("使用者猜比七大");
                    if (ans >= 7) {
                        System.out.printf("電腦數字: %d, 恭喜答對了!\n", ans);
                        wallet.updateMoney(bet);
                    }else{
                        System.out.printf("電腦數字: %d, 抱歉答錯囉!\n", ans);
                        wallet.updateMoney(bet * -1);
                    }
                    break;
                case 2: //猜測比七小
                    System.out.println("使用者猜比七小");
                    if (ans < 7) {
                        System.out.printf("電腦數字: %d, 恭喜答對了!\n", ans);
                        wallet.updateMoney(bet);
                    }else{
                        System.out.printf("電腦數字: %d, 抱歉答錯囉!\n", ans);
                        wallet.updateMoney(bet * -1);
                    }
                    break;
            }
    }
}
