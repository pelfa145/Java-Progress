public class Employee extends Person {

    int salary;

    Employee(String first, String last,int age, int salary){
        super(first, last, age);
        this.salary = salary;
    }

    void displaySalary(){
        System.out.println(this.firstName+"'s salary is $"+this.salary);
    }

}
