package org.project;
import java.sql.*;
public class Main{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_management";
        String user = "root";
        String password = "1234";

        try{
            Connection connection = Database.connect();

            System.out.println("Connected");

            Statement statement = connection.createStatement();

            String sql = """
                    CREATE TABLE IF NOT EXISTS students (
                        student_id INT PRIMARY KEY,
                        first_name VARCHAR(50),
                        last_name VARCHAR(50),
                        age INT,
                        course VARCHAR(50),
                        year_level INT)
                    """;
            statement.executeUpdate(sql);
            System.out.println("Student tables created!");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
    }
}
