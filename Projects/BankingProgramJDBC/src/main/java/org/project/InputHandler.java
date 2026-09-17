package org.project;

import java.util.Scanner;

public class InputHandler {

    Scanner input = new Scanner(System.in);

    int returnInt(){
        int integer = input.nextInt();
        input.nextLine();
        return integer;
    }

    String returnString(){
        return input.nextLine();
    }
}
