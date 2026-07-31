import java.util.Scanner;
public class miniproject{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = input.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = input.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = input.next().charAt(0);

        for(int j = 0;j < rows;j++){
            for(int i = 0;i < columns;i++){
            System.out.print(symbol);         
            }
            System.out.println(symbol);
        }

    }
}