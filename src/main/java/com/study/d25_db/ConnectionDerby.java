package com.study.d25_db;

// 連線到資料庫

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import sun.security.util.Password;

public class ConnectionDerby {
    public static void main(String[] args) throws SQLException{
        Connection conn = getConnection();
        if (conn.isClosed()) {
            System.out.println("資料庫連線已關閉");
        }else{
            System.out.println("資料庫已連線, 可以開始下達指令...");
        }
    }
    
    public static Connection getConnection() throws SQLException{
        String url="jdbc:derby://localhost:1527/sample";
        String username="app";
        String password="app";
        Connection conn = DriverManager.getConnection(url, username,  password);
        return conn;
    }
}
