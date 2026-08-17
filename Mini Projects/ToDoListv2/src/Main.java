public class Main {
    static InputHandler input = new InputHandler();
    public static void main(String[] args) {
        showMenu();

        input.close();
    }
    static void showMenu(){
        boolean quit = false;
        while(!quit) {
            System.out.println("===To Do List===\n\n1. Add a task\n2. View task\n3. Remove Task\n4. Exit.");
            System.out.print("Choose an option: ");
            int choice = input.returnInt();
            switch(choice){
                case -1 -> System.out.println("Error.");
                case 1 -> input.addTask();
                case 2 -> input.viewTask();
                case 3 -> input.deleteTask();
                case 4 -> quit = true;
                default -> System.out.println("Choose a number between 1-4.");
            }
        }
    }
}
