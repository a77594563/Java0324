package com.study.d20;

// 帳戶
class Account {

    private int balance; // 帳戶餘額

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // 提款
    public synchronized void withdraw(int money) {
        String who = Thread.currentThread().getName();
        System.out.printf("%s 開始提款\n", who);
        int current_balance = getBalance(); // 取得目前的帳戶餘額
        System.out.printf("%s 看到目前的帳戶餘額是: $%d\n", who, current_balance);
        // 進行提款之行為
        if (current_balance >= money) {
            // 帳戶餘額扣款
            setBalance(current_balance - money);
            // 提款成功
            System.out.printf("%s 提款 $%d 成功, 帳戶餘額 $%d\n", who, money, getBalance());
        } else {
            // 提款失敗
            System.out.printf("%s 提款 $%d 失敗, 帳戶餘額 $%d\n", who, money, getBalance());
        }

    }
}

class Withdraw implements Runnable { // 提款行為

    private Account account;
    private int money;

    public Withdraw(Account account, int money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        account.withdraw(money); // 對該帳戶進行提款動作
    }

}

public class ATM {

    public static void main(String[] args) {
        Account account = new Account(10000); // 帳號有 $10000 元
        Withdraw w1 = new Withdraw(account, 5000); // 欲提款 $5000 元的工作
        Withdraw w2 = new Withdraw(account, 4000); // 欲提款 $4000 元的工作
        Withdraw w3 = new Withdraw(account, 3000); // 欲提款 $3000 元的工作
        Thread t1 = new Thread(w1, "小明"); // 指派小明做 w1 的工作
        Thread t2 = new Thread(w2, "小華"); // 指派小華做 w2 的工作
        Thread t3 = new Thread(w3, "小英"); // 指派小英做 w3 的工作
        t1.start(); // 小明開始工作
        t2.start(); // 小華開始工作
        t3.start(); // 小英開始工作
    }
}
