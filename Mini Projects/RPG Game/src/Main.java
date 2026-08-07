
import abstracts.Character;
import abstracts.characters.*;

public class Main {
    public static void main(String[] args) {

        Character[] characters = {
                new Warrior("Jadon", "Human", 18),
                new Archer("Yanni", "Dwarf", 19),
                new Mage("Sheena", "Elf", 200)
        };

        loopThroughAttacks(characters);
    }
    static void loopThroughAttacks(Character[] arr){
        for (int i = 0; i < arr.length * 3; i++) {
            System.out.print(arr[0].getName()+"("+arr[0].getRace()+"): ");
            arr[0].attack();
            System.out.print(arr[1].getName()+"("+arr[1].getRace()+"): ");
            arr[1].attack();
            System.out.print(arr[2].getName()+"("+arr[2].getRace()+"): ");
            arr[2].attack();

        }

    }
}
