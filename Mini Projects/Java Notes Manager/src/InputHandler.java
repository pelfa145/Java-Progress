import java.util.Scanner;
public class InputHandler {
    static Scanner input = new Scanner(System.in);
    FileHandler notes = new FileHandler();

    void noteContents(){
        System.out.print("-> ");
        String contents = input.nextLine();
        notes.writeToNotes(contents);
    }

    void close(){
        input.close();
    }

    int returnInt(){
        int Int = input.nextInt();
        input.nextLine();
        return Int;
    }
}
