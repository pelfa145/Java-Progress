import java.util.Scanner;
public class App{
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] questions = {{1, 2, 3, 4},
                             {1, 2, 3, 4}, 
                             {1, 2, 3, 4}, 
                             {1, 2, 3, 4}, 
                             {1, 2, 3, 4}};

        int total = start(questions);    

        System.out.println("You got "+total+" questions correct!");

        scanner.close();
    }
    static int start(int[][] arr){
        int total = 0;
        System.out.println("====================\n   JAVA QUIZ GAME   \n====================");
        System.out.println("What is the purpose of a router?\n\n1. Kiss my ass\n2.Kiss your ass\n3.Direct network traffic\n4. Kiss their ass");
        //answer is 3
        System.out.print("Your guess: ");
        int choiceQ1 = scanner.nextInt();
        if(arr[0][2] == choiceQ1){
            System.out.println("=======\nCORRECT!\n=======");
            total ++;
        } else {System.out.println("=======\nFALSE!\n=======");}
         System.out.println("Who is yo mama?\n\n1.Kiss my ass\n2.Eden\n3.Direct network traffic\n4.Kiss their ass\n");
         //answer is 2
        System.out.print("Your guess: ");
        int choiceQ2 = scanner.nextInt();
        if(arr[1][1] == choiceQ2 ){
            System.out.println("=======\nCORRECT!\n=======");
            total++;
        } else {System.out.println("=======\nFALSE!\n=======");}
        System.out.println("Who is yo papa?\n\n1.Ronie\n2.Eden\n3.Direct network traffic\n4.Kiss their ass");
        //answer is 1
        System.out.print("Your guess: ");
        int choiceQ3 = scanner.nextInt();
        if(arr[2][0] == choiceQ3){
            System.out.println("=======\nCORRECT!\n=======");
            total++;
        } else {System.out.println("=======\nFALSE!\n=======");}
        System.out.println("Who is yo kuya?\n\n1.Ronie\n2.Eden\n3.Direct network traffic\n4.Kynan");
        //answer is 4 
        System.out.print("Your guess: ");
        int choiceQ4 = scanner.nextInt();
        if(arr[3][3] == choiceQ4){
            System.out.println("=======\nCORRECT!\n=======");
            total++;
        } else {System.out.println("=======\nFALSE!\n=======");}
        System.out.println("Who is yo ninong?\n\n1.Kiss my ass\n2.Eden\n3.Direct network traffic\n4.Raul Crisostomo");
        //answer is 4
        System.out.print("Your guess: ");
        int choiceQ5 = scanner.nextInt();
        if(arr[4][3] == choiceQ5){
            System.out.println("=======\nCORRECT!\n=======");
            total++;
        } else {System.out.println("=======\nFALSE!\n=======");}
        return total;
    }
}