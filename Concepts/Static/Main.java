
public class Main {
    public static void main(String[] args) {

        Friend friend1 = new Friend("Fred");
        Friend friend2 = new Friend("Alyanna");
        Friend friend3 = new Friend("Brag");
        Friend friend4 = new Friend("Chad");

        friend1.printName();
        friend2.printName();
        friend3.printName();
        friend4.printName();


        Friend.showFriends();
    }
}
