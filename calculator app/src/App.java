import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      double firstNumber;
      double secondNumber;
      char operator;
      double finalOutput = 1.0f;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter your first number: ");
            firstNumber = scanner.nextFloat();

            System.out.print("Enter an operator (+, -, *, /, ^): ");
            operator = scanner.next().charAt(0);

            System.out.print("Enter your second number: ");
            secondNumber = scanner.nextFloat();
      }  
      switch(operator){
        case('+') -> finalOutput = firstNumber + secondNumber;
        case('-') -> finalOutput = firstNumber - secondNumber;
        case('*') -> finalOutput = firstNumber * secondNumber;
        case('/') -> finalOutput = firstNumber / secondNumber;
        case('^') -> finalOutput = Math.pow(firstNumber, secondNumber);
        default -> System.out.println("Enter a correct operator");
      }
      System.out.println(finalOutput);
      
    }
}
