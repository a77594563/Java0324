package com.study.d25_db.crud;

import com.study.d25_db.ConnectionDerby;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Update {
    public static void main(String[] args) {
        String sql = "UPDATE Student SET age=?, name=? WHERE id=?";
        try (Connection conn = ConnectionDerby.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ){
            pstmt.setInt(1, 25);
            pstmt.setString(2, "Tom");
            pstmt.setInt(3, 1);
            int rowcount = pstmt.executeUpdate();
            System.out.printf("異動比數: %d\n", rowcount);
        } catch (Exception e) {
        }
        
    }
}
