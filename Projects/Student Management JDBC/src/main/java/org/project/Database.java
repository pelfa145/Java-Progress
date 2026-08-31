package org.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static String url = "mysql://localhost:3306/student_management";
    private static String user = "root";
    private static String password = "1234";

    public static Connection connection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
