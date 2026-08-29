import java.io.IOException;
public class Main{
    static Database db = new Database();
    public static void main(String[] args) {
        try {
            FileHandling.loadFile(db.getStudents());
        } catch (IOException e) {
//            throw new RuntimeException(e);
        }
        InputHandler.showMenu();
        InputHandler.close();
    }
}
