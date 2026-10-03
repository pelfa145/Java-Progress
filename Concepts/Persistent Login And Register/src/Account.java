public class Account{

    private String email;
    private String password;
    private String fullName;
    private int age;
    private String address;

    public Account(String email, String password){
        this.email = email;
        this.password = password;
    }


    public Account(String email, String password, String fullName, int age, String address){
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

//getters
    public String getEmail(){return this.email;}
    public String getPassword(){return this.password;}
    public int getAge(){return this.age;}
    public String getAddress(){return this.address;}
    public String getFullName(){return this.fullName;}

    public void showProfile(){
        System.out.printf("===Profile===\nName: %s\nAge: %d\nEmail: %s", this.fullName, this.age, this.email);
    }
}