package org.project;
import java.sql.SQLException;
import java.util.Scanner;
public class InputHandling {
    private static Scanner input = new Scanner(System.in);

    public static void showMenu(){
        boolean quit = false;
        while(!quit) {
            System.out.println("==Student Management==\n1. Add Student\n2. View Student Info\n3. Remove Student\n4. View All Students\n5. Quit");
            System.out.print("Enter your choice: ");
            int choice = returnInt();
            switch(choice){
                case 1 -> addStudent();
                case 2 -> {
                try{printStudent();} catch (SQLException e) {
                    throw new RuntimeException(e);
                }}
                case 3 -> {
                    try{
                        deleteStudent();
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }
                case 4 -> {}
                case 5 -> quit = true;
            }

        }
    }
    static Integer returnInt(){
        int Int = input.nextInt();
        input.nextLine();
        return Int;
    }
    static String returnString(){
        return input.nextLine();
    }
    //user inputs
    static void addStudent(){
        System.out.println("Enter students name (Last name, First Name): ");
        String fullName = returnString();
        String[] nameParts = fullName.split(", ");
        String first = nameParts[1];
        String last = nameParts[0];
        System.out.print("Enter students age: ");
        int age = returnInt();
        System.out.print("Enter students course: ");
        String course = returnString();
        System.out.print("Enter students year level: ");
        String initialYearLevel = returnString();
        int yearLevel = Character.getNumericValue(initialYearLevel.charAt(0));
        int studentID;
        try{studentID = StudentRepository.generateID();} catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Student newStudent = new Student(studentID,first, last, age, course, yearLevel);
        try{StudentRepository.insertStudent(newStudent);} catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    static void printStudent() throws SQLException{
        System.out.print("Enter students ID: ");
        int studentID = returnInt();
        StudentRepository.printStudent(studentID);
    }
    static void deleteStudent()throws SQLException{
        System.out.println("Enter students ID: ");
        int studentID = returnInt();
        StudentRepository.deleteStudent(studentID);
    }
}


