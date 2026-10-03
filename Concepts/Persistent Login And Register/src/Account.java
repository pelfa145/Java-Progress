public class Account{

    private String email;
    private String password;
    private String username;
    private String fullName;
    private int age;
    private String address;

    public Account(String email, String password){
        this.email = email;
        this.password = password;
    }
    public Account(String email, String password, String username){
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public Account(String email, String password, String username, String fullName, int age, String address){
        this.email = email;
        this.password = password;
        this.username = username;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }
}