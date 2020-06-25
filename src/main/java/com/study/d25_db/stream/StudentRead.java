package com.study.d25_db.stream;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class StudentRead {
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/sample";
        String username = "app";
        String password = "app";
        
        List<Student> list = null;
        try (Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery("SELECT id, age, name FROM Student");) {

            list = StreamHelper
                    .stream(rs)
                    .map(r -> (new Student(r.get("ID", Integer.class), r.getString("NAME"), r.get("AGE", Integer.class))))
                    .collect(toList());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        list.stream().filter(s -> s.getAge() > 30).forEach(System.out::println);
    }
}
