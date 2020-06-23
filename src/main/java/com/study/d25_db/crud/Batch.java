package com.study.d25_db.crud;

import com.github.javafaker.Faker;
import com.study.d25_db.ConnectionDerby;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;
import java.util.stream.IntStream;

public class Batch {

    public static void main(String[] args) {
        String sql = "INSERT INTO Student(age, name) VALUES(?, ?)";
        try (Connection conn = ConnectionDerby.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.clearBatch();
            
            for (int i = 0; i < 100; i++) {
                pstmt.setInt(1, new Random().nextInt(40) + 10);
                pstmt.setString(2, new Faker().name().firstName());
                pstmt.addBatch();
            }

            int[] rowcounts = pstmt.executeBatch();
            System.out.printf("異動比數: %d\n", rowcounts.length);
        } catch (Exception e) {
        }
    }
}
