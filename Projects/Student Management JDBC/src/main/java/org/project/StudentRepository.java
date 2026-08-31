package org.project;

import java.sql.*;

import static org.project.Database.connection;

public class StudentRepository {

    static Connection connection;

    static {
        try {
            connection = connection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertStudent(Student student) throws SQLException {
        String sql = """
                INSERT INTO students 
                (student_id, first_name, last_name, age, course, year_level)
                VALUES (?, ?, ?, ?, ?, ?);
                """;

        try (PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, student.getStudentID());
            statement.setString(2, student.getFirst());
            statement.setString(3, student.getLast());
            statement.setInt(4, student.getAge());
            statement.setString(5, student.getCourse());
            statement.setInt(6, student.getYearLevel());

            statement.executeUpdate();
        }
    }

    static int generateID() throws SQLException {
        ResultSet sw;
        try (PreparedStatement statement = connection.prepareStatement("SELECT COUNT(*) AS total_students FROM students")) {
            sw = statement.executeQuery();
            sw.next();
            int totalStudents = sw.getInt("total_students");
            if (totalStudents == 0) {
                return 2026000;
            }
            return 2026000 + totalStudents;
        }
    }

    static void close() throws SQLException{
        connection.close();
    }

}
