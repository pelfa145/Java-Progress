import java.util.Scanner;
import java.util.Random;
public class App {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int totalRolls = 0;

    public static void main(String[] args) {
        System.out.print("Enter the number of dice to roll: ");
        int diceQuant = scanner.nextInt();
        System.out.println("Rolling "+diceQuant+" dice...");
        randomRoll(diceQuant - 1);
        System.out.println("Your total rolls are "+totalRolls);

    }
    static void randomRoll(int input){
        for(int i=0;i <= input; i++){
            int randomRoll = random.nextInt(0,5);
            rollDice(randomRoll);
        }
        

    }
    static void rollDice(int input) {
        String[] dice = {
                """
                        +-------+
                        |       |
                        |   *   |
                        |       |
                        +-------+\nYou rolled: 1""",

                """
                        +-------+
                        | *     |
                        |       |
                        |     * |
                        +-------+\nYou rolled: 2""",

                """
                        +-------+
                        | *     |
                        |   *   |
                        |     * |
                        +-------+\nYou rolled: 3""",

                """
                        +-------+
                        | *   * |
                        |       |
                        | *   * |
                        +-------+\nYou rolled: 4""",

                """
                        +-------+
                        | *   * |
                        |   *   |
                        | *   * |
                        +-------+\nYou rolled: 5""",

                """
                        +-------+
                        | *   * |
                        | *   * |
                        | *   * |
                        +-------+\nYou rolled: 6"""
        };
        switch (input){
            case 0 -> totalRolls += 1;
            case 1 -> totalRolls += 2;
            case 2 -> totalRolls += 3;
            case 3 -> totalRolls += 4;
            case 4 -> totalRolls += 5;
            case 5 -> totalRolls += 6;
        }
        System.out.println(dice[input]);

    }
}
