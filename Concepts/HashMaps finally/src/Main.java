import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Jadon", 95);
        scores.put("Wota", 75);
        scores.put("Sinae", 86);
        scores.put("Mark", 65);

        int score = scores.get("Jadon");

        System.out.println(scores.get("Jadon"));

    }
}
