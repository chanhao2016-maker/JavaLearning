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

        scanner.close();

    }
}