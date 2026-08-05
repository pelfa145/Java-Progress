public class Friend {

    String name;
    static int friendCount = 0;
    Friend(String name){
        this.name = name;
        friendCount++;
    }
    static void showFriends(){
        System.out.println("You have "+friendCount+" friends.");
    }
    void printName(){
        System.out.println("This friends name is "+ this.name+".");
    }
}
