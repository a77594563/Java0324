package com.study.d25_db.crud;

import com.study.d25_db.ConnectionDerby;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Read {
    public static void main(String[] args) {
        String sql = "SELECT id, age, name FROM Student";
        try (Connection conn = ConnectionDerby.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)){
            ResultSetMetaData md = rs.getMetaData();
            System.out.printf("%5s%5s%10s\n", md.getColumnName(1), md.getColumnName(2), md.getColumnName(3));
            System.out.println("----------------------------");
            while (rs.next()) {                
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String name = rs.getString("name");
                System.out.printf("%5d%5d%10s\n", id, age, name);
            }
        } catch (Exception e) {
        }
        
    }
}
