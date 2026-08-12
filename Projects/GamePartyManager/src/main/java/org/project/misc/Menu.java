package org.project.misc;

import org.project.GameParty;

public class Menu {
    static InputHandler input = new InputHandler();
    GameParty gp = new GameParty();

    public void ShowMenu() {
        boolean run = true;
        while (run) {
            System.out.println("--Game Party Menu--\n\n1. Add player\n2. Remove player\n3. View party\n4. Damage player\n5. Heal player\n6. Level Up Player\n7. Show stats\n8. Exit");
            System.out.print("\n\nChoose: ");
            int choice = input.returnInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Username: ");
                    String username = input.returnString();
                    gp.addPlayer(username);
                }
                case 2 -> gp.removePlayer();

                case 3 -> gp.showParty();

                case 4 -> gp.damagePlayer();

                case 5 -> gp.healPlayer();

                case 6 -> gp.levelUpPlayer();

                case 7 -> gp.displayStatsOfPlayer();

                case 8 -> run = false;

                default -> System.out.println("Enter a number between 1-8.");
            }
        }
    }
}
