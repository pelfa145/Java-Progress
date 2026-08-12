package org.project;
public class Player {

    private final int id;
    private String username;
    private int health;
    private int level;

    Player(int id, String username) {
        this.id = id;
        this.health = 100;
        this.level = 1;
        this.username = username;
    }

    //getters
    int getId(){return id;}
    int getHealth(){return health;}
    int getLevel(){return level;}
    String getUsername(){return username;}
    //setters
    void takeDamage(int amount){
        this.health -= amount;
        System.out.println(this.username+" took "+amount+" Damage! Remaining HP: "+this.health);
    }
    void heal(int amount){
        this.health += amount;
        System.out.println(this.username+" has healed +"+amount+"HP.");
    }
    void levelUp(){
        this.level ++;
        System.out.println(this.username+" has leveled up!");
    }
    void displayStats(){
        System.out.println(this.username+"\nHP: "+this.health+"\nLevel: "+this.level);
    }


}
