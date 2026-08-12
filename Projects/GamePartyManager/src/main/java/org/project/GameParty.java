package org.project;
import org.project.misc.InputHandler;

import java.util.ArrayList;
import java.util.Random;

public class GameParty {
    ArrayList<Player> players = new ArrayList<>();
    static InputHandler input = new InputHandler();
    public void addPlayer(String username){
        players.add(new Player(generateID(),username));
        System.out.println("Added "+username+".");
    }

    int generateID(){
        if(!players.isEmpty()){
            return players.getLast().getId() + 1;
        }
        return 2026000;
    }

    public void removePlayer(){
        int idIndex = findPlayer();
        if(idIndex == -1){
            System.out.println("No player with "+idIndex+" was found.");
            return;
        }
        try{players.remove(idIndex);}catch (Exception e){
            System.out.println("Something went wrong try again.");
        }
    }


    private int findPlayer(){
        System.out.print("Enter player ID: ");
        int idInput = input.returnInt();
        for (int i = 0; i < players.size(); i++) {
            if(players.get(i).getId() != idInput){continue;}
            else {return i;}
        }
        return -1;
    }

    public void showParty(){
        System.out.println("ID|Name|Health|Level");
        for(Player p : players){
            System.out.println(p.getId()+"|"+p.getUsername()+"|"+p.getHealth()+"|"+p.getLevel());
        }
    }
    //damage player.
    public void damagePlayer(){
        int current = findPlayer();
        if(current == -1){
            System.out.println(current+" can't be found.");
            return;
        }
        Player selectedPlayer = players.get(current);
        int damageTaken = random.nextInt(1,41);
        selectedPlayer.takeDamage(damageTaken);
    }
    private final Random random = new Random();

    public void healPlayer(){
        int current = findPlayer();
        if(current == -1){
            System.out.println(current+" can't be found.");
            return;
        }
        Player selectedPlayer = players.get(current);
        int healed = random.nextInt(1,41);
        selectedPlayer.heal(healed);
    }
    public void levelUpPlayer(){
        int current = findPlayer();
        if(current == -1){
            System.out.println(current+" can't be found.");
            return;
        }
        Player selectedPlayer = players.get(current);
        selectedPlayer.levelUp();
    }
    public void displayStatsOfPlayer(){
        int current = findPlayer();
        if(current == -1){
            System.out.println(current+" can't be found.");
            return;
        }
        Player selectedPlayer = players.get(current);
        selectedPlayer.displayStats();
    }
}
