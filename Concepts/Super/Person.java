public class Person {
    String firstName;
    String lastName;

    int age;

    Person(String firstName,String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    void showName(){
        System.out.println("This persons name is "+firstName+" "+lastName+".");
    }
}
