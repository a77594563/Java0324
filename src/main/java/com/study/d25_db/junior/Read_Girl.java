package com.study.d25_db.junior;

import com.study.d25_db.ConnectionDerby;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Read_Girl {

    public static void main(String[] args) {
        String sql = "SELECT * FROM APP.JUNIOREXAM \n"
                + "WHERE school not like ('%男%') and school not in ('建中','成功')";
        try (Connection conn = ConnectionDerby.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();) {

            int my_sort = 2500;
            String my_school = null;
            int quote_sum = 0;
            while (rs.next()) {
                String school = rs.getString("school");
                int quote = rs.getInt("quote");
                quote_sum += quote;
                if (quote_sum >= my_sort) {
                    my_school = school;
                    break;
                }
            }
            System.out.printf("女生排名: %d 落點學校: %s\n", my_sort, my_school);

        } catch (Exception e) {
        }
    }
}
