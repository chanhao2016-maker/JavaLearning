import java.util.Scanner;

public class Main{
    public static void main (String[] agrs){
        // calculate area of rectangle

        double width0 = 1;
        double height0 = 1;
        double area0 = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        width0 = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height0 = scanner.nextDouble();

        area0 = width0 * height0;

        System.out.println("The area is " + area0 + "cm²");

        double width = 0 ;
        double height = 0 ;
        double area = 0 ;

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is " + area + "cm²");

        scanner.close();


    }


}



// calculate area of rectangle