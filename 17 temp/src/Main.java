import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.nextLine().toUpperCase();

        // (condition) ? true : false

        newTemp = (unit.equals("C")) ? (temp - 32) * 5.0 / 9.0 : (temp * 5.0/9.0)+32;

        System.out.printf("The new Temperature is %.2f°%s",newTemp,unit);
        scanner.close();

    }
}