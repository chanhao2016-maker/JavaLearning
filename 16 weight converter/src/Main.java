import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Weight conversion program

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();


        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is %.2fkg", newWeight);
        }

        else if (choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight / 0.453592 ;
            System.out.printf("The new weight in lbs is %.2f pounds", newWeight);
        }

        else{
            System.out.println("This is not a valid choice!");
        }

              /*double temp;
        double mewTemp;
        String unit;

        System.out.println("Enter the temperature: ");
        temp = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter the Type you want to convert(c,f): ");
        unit = scanner.nextLine().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5.0 / 9.0 : (temp * 5.0/9.0)+32;

        System.out.printf("The new Temperature is %.2f°%s",newTemp,unit);

         */

        scanner.close();

    }
}