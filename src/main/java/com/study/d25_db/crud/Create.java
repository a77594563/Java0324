package com.study.d25_db.crud;

import com.study.d25_db.ConnectionDerby;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Create {
    public static void main(String[] args) {
        String sql = "INSERT INTO Student(age, name) VALUES(?, ?)";
        try (Connection conn = ConnectionDerby.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ){
            pstmt.setInt(1, 20);
            pstmt.setString(2, "Joe");
            int rowcount = pstmt.executeUpdate();
            System.out.printf("異動比數: %d\n", rowcount);
        } catch (Exception e) {
        }
        
    }
}
