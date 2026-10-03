import java.util.Scanner;

public class InputHandler{
    
    static Scanner input = new Scanner(System.in);

    public String returnString(){
        return input.nextLine();
    }

    public void close(){
        input.close();
    }

    public int returnInteger(){
        int integer = input.nextInt();
        input.nextLine();
        return integer;
    }
    
}