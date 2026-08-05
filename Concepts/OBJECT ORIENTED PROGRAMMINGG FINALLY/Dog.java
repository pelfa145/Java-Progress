public class Dog {

    static String breed = "German";
    static String breed2 = "Shepherd";

    static int age = 10;
    static double price = 30000.00;
    static boolean isHealthy = true;
    void printDog(){
        System.out.println("Your dogs breed is "+breed+" "+breed2+". and he is "+age+" years old, healthy?: "+isHealthy+". he is $"+price);
    }
    void bark(){
        System.out.println("Bark");

    }
}
