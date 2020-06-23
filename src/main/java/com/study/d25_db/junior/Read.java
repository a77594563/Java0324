package com.study.d25_db.junior;

import com.study.d25_db.ConnectionDerby;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Read {

    public static void main(String[] args) {
        String sql = "SELECT * FROM APP.JUNIOREXAM \n"
                + "WHERE score <= ?\n"
                + "ORDER BY score DESC\n"
                + "FETCH FIRST ? ROWS ONLY";
        try (Connection conn = ConnectionDerby.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ) {
            
            pstmt.setFloat(1, 29.1f);
            pstmt.setInt(2, 5);
            ResultSet rs = pstmt.executeQuery();
            
            ResultSetMetaData md = rs.getMetaData();
            System.out.printf("%10s%10s%10s\n", md.getColumnName(1), md.getColumnName(2), md.getColumnName(3));
            System.out.println("------------------------------------");
            while (rs.next()) {                
                String school = rs.getString("school");
                int quote = rs.getInt("quote");
                float score = rs.getFloat("score");
                System.out.printf("%10s%10d%10.1f\n", school, quote, score);
                
            }
            
        } catch (Exception e) {
        }
    }
}
