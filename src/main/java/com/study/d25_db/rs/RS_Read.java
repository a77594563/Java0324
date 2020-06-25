package com.study.d25_db.rs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RS_Read {

    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/sample";
        String username = "app";
        String password = "app";
        try (Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery("SELECT id, age, name FROM Student");) {

            while (rs.next()) {
                System.out.printf("%10d%10d%10s\n", rs.getInt("id"), rs.getInt("age"), rs.getString("name"));
            }
        } catch (SQLException ex) {
        }
    }
}
