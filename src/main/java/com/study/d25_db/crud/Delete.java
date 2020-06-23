package com.study.d25_db.crud;

import com.study.d25_db.ConnectionDerby;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Delete {
    public static void main(String[] args) {
        String sql = "DELETE FROM Student WHERE id=?";
        try (Connection conn = ConnectionDerby.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ){
            pstmt.setInt(1, 1);
            int rowcount = pstmt.executeUpdate();
            System.out.printf("異動比數: %d\n", rowcount);
        } catch (Exception e) {
        }
        
    }
}
