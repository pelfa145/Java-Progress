package abstracts.characters;

import abstracts.Character;

import java.util.Random;

public class Archer extends Character{
    static Random ran = new Random();

    private String name;
    private String race;
    private int age;

    public Archer(String name, String race, int age){
        this.name = name;
        this.race = race;
        this.age = age;
    }
    @Override
    public void attack(){
        String[] attacks = {"Shoots an arrow!", "Stabs with an arrow!", "Dodge!", "Punches!"};
        int attackChoice = ran.nextInt(0, attacks.length);
        System.out.println(attacks[attackChoice]);
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public String getRace(){
        return this.race;
    }
}
