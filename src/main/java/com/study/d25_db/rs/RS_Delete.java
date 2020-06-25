package com.study.d25_db.rs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RS_Delete {

    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/sample";
        String username = "app";
        String password = "app";
        try (Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("SELECT id, age, name FROM Student WHERE name = '屈原'");) {
            
            // 刪除
            if (rs.last()) {
                rs.deleteRow();
                System.out.println("刪除完成");

            }else{
                System.out.println("無此資料");
            }
        } catch (SQLException ex) {
        }
    }
}
