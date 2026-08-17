public class Main {
    static InputHandler input = new InputHandler();
    public static void main(String[] args) {
    showMenu();
    input.closeFiles();
    }
    static void showMenu(){
        boolean quit = false;
        while(!quit){
            System.out.println("TO DO LIST\n\n1. Add a task\n2. View tasks\n3. Remove task\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = input.returnInt();
            switch(choice){
                case 1 -> input.addTask();
                case 2 -> input.print();
                case 3 -> input.deleteTask();
                case 4 -> quit = true;
            }
        }
    }
}
