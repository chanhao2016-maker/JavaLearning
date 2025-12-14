import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // Enhanced switch = A replacement to many else Statement

        Scanner scanner = new Scanner(System.in);

        String day = "friday";

        System.out.print("Enter the day: ");

        day = scanner.nextLine();



        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It is a weekday");

            case "Saturday", "Sunday"-> System.out.println("It is a weekdend");

            default -> System.out.println(day + " is not a day");
        }

    }
}