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

    static void close() throws SQLException {
        connection.close();
    }

    public static void printStudent(int studentID) throws SQLException {
        String sql = "SELECT * FROM students WHERE student_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, studentID);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                Student student = new Student(result.getInt("student_id"), result.getString("first_name"), result.getString("last_name"), result.getInt("age"), result.getString("course"), result.getInt("year_level"));

                System.out.println(student.getFirst() + " " + student.getLast() + "\n" + "Age: " + student.getAge() + "\n" + "Course: " + student.getCourse() + "\n" + "Year Level: " + student.getYearLevel() + "st/nd year.");
                result.close();
            } else {
                System.out.println("Student with " + studentID + " ID not found.");
            }
        }
    }

    public static void deleteStudent(int studentID) throws SQLException {
        String sql = """
                DELETE FROM students WHERE student_id = ?; 
                """;
        String sqlDeletedStudent = """
               SELECT first_name, last_name FROM students where student_id = ?;
                """;
        String fullName = "";
        boolean found = false;
        try(PreparedStatement statement1 = connection.prepareStatement(sqlDeletedStudent)){
            statement1.setInt(1, studentID);
            statement1.executeQuery();
            ResultSet resultSet = statement1.getResultSet();
            if(resultSet.next()) {
                String deletedStudentFirst = resultSet.getString("first_name");
                String deletedStudentLast = resultSet.getString("last_name");
                fullName = deletedStudentFirst + " " + deletedStudentLast;
                found = true;
            }
            else {
                System.out.println("No results found.");
                return;
            }
        }
        if(found) {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {

                statement.setInt(1, studentID);
                statement.executeUpdate();
                System.out.println("Successfully deleted " + fullName + ".");

            }
        }
    }

    static void printAllStudent()throws SQLException{
        String sql = """
                SELECT * FROM students
                """;
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                System.out.println("=========================================\nID|Name|Age|Course|Year");
                boolean finished = false;
                while(!finished){
                    Student i = new Student(resultSet.getInt("student_id"), resultSet.getString("first_name"), resultSet.getString("last_name"), resultSet.getInt("age"), resultSet.getString("course"), resultSet.getInt("year_level"));
                    System.out.println(i.getStudentID()+"|"+i.getFirst()+"|"+i.getLast()+"|"+i.getAge()+"|"+i.getCourse()+"|"+i.getYearLevel());
                }
            }
        }
    }
}
