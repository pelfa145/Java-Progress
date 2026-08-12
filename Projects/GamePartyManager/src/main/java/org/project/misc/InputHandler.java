package org.project.misc;
import java.util.Scanner;
public class InputHandler {
    static Scanner input = new Scanner(System.in);

    public String returnString(){
        return input.nextLine();
    }
    public int returnInt(){
        int returnVal = input.nextInt();
        input.nextLine();
        return returnVal;
    }
    public void close(){
        input.close();
    }

}
