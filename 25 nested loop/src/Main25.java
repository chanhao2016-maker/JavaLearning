import java.util.Scanner;

public class Main25{
    public static void main(String[]args){

        // nested loop = a loop inside another loop
        //               Used often with matrices or DS&A

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol: ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i < rows; i ++){
        for(int j = 0; j < columns; j ++){
            System.out.print(symbol);
        }
        System.out.println();}

        scanner.close();



    }
}