import java.util.Scanner;
public class AppV2{
    static Scanner scanner = new Scanner(System.in);
    static int total = 0;
    public static void main(String[] args) {
    
    String[] questions = {"Which type of smartphone screen technology requires a backlight to illuminate the display pixels?\n1. OLED\n2. AMOLED\n3. LCD\n4. Plasma",
                        "RAID Configuration that minimum of 3 drives?\n1. RAID 1\n2. RAID 0\n3. RAID 5\n4. RAID 10",
                        "Which default port is used securely for HTTPS web traffic?\n1. Port 80\n2. Port 23\n3. Port 443\n4. Port 67",
                        "A user wants a high-end server type that can detect and correct internal data memory errors on-the-fly. What type of RAM is needed?\n1. Virtual RAM\n2. ECC RAM\n3. GDDR5 RAM\n4. LPDDR5 RAM",
                        "A desktop computer keeps losing the correct time and date settings whenever the system is completely unplugged from power. What component is most likely failing?\n1. CMOS\n2. Software\n3. GPU\n4. RAM"};
    //answer is   3,3,3,2,1
    int[][] correctAnswers={{3},{3},{3},{2},{1}};


        startQuiz(questions, correctAnswers);

        System.out.println("Your score is "+ total+"!");
    }
    static int startQuiz(String[] questions, int[][] correctAns){
        int i = 0;
        for(String question :questions){
            i += 1;
            System.out.println(i+") "+question);
            System.out.print("Your guess: ");
            int answer1 = scanner.nextInt();
            
            verifyAnswer(answer1,correctAns, i-1);
        }


    return -1;
    }
    static void verifyAnswer(int answer, int[][] answers, int i){
        if(answer == answers[i][0]){
            System.out.println("Correct!");
            total ++;
        } else{
            System.out.println("Wrong!");
        }
        

    }
}