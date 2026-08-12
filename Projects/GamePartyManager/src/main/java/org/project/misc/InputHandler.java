package org.project.misc;

import java.util.Scanner;

public class InputHandler {
    static Scanner input = new Scanner(System.in);

    public String returnString() {
        return input.nextLine();
    }

    public int returnInt() {
        try {
            int returnVal = input.nextInt();
            input.nextLine();
            return returnVal;
        } catch (Exception e) {
            System.out.println("Try again.");
            return -1;
        }

    }

    public void close() {
        input.close();
    }

}
