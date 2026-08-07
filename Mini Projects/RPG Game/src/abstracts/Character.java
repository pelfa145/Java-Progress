package abstracts;

public abstract class Character {

    int age;


    public abstract void attack();

    public void heal(){
        System.out.println("Healed");
    }

    public abstract String getName();
    public abstract String getRace();
}
