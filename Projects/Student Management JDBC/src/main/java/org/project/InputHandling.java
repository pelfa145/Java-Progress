package org.project;
import java.util.Scanner;
public class InputHandling {
    private static Scanner input = new Scanner(System.in);

    public void showMenu(){
        boolean quit = false;
        while(!quit) {
            System.out.println("==Student Management==\n1. Add Student\n2. View Student Info\n3. Remove Student\n4. View All Students\n5. Quit");
            System.out.print("Enter your choice: ");
            int choice = returnInt();
            switch(choice){
                case 1 -> StudentRepository.addStudent();
                case 2 -> {}
                case 3 -> {}
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

}
