package org.project;
import java.sql.*;
public class StudentRepository{

    static Connection connection;

    static {
        try {
            connection = Database.connection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addStudent(){
        System.out.println();
    }

}
