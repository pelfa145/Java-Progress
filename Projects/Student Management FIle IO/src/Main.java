public class Main {
    static InputHandler input = new InputHandler();
    public static void main(String[] args) {
        System.out.println(FileHandling.generateID());
        FileHandling.loadFile();
        input.showMenu();
        FileHandling.saveFile();
    }

}
