public class Main{
    public static void main(String[] args) {
        User user1 = new User("pelfa");
        User user2 = new User("pelfa213", "pelfa2135@gmail.com");
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);
    }
}