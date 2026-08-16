import java.io.File;
import java.io.IOException;

public class main {
   static InputHandler input = new InputHandler();
   static FileHandler file = new FileHandler();
    public static void main(String[] args){
        showMenu();
        input.close();
        file.closeNotes();
    }
    static void showMenu(){
        boolean quit = false;

        while(!quit){
            System.out.println("Notes Manager\n\n1.Add note\n2.View Notes\n3. Clear Notes\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.returnInt();
            switch(choice){
                case 1 -> input.noteContents();
                case 2 -> file.viewNotes();
                case 3 -> file.clearNotes();
                case 4 -> quit = true;
            }
        }
    }
}
