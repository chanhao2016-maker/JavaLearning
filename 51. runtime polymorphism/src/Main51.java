import java.util.Scanner;

public class Main51 {
    public static void main(String[] args){

        // Runtime polymorphism = When the method that gets executed is decided
        //                        at runtime based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.print("Would you like a dog or cat?(1 = cat, 2 = dog): ");
        int choice = scanner.nextInt();

        if (choice == 1){
            animal = new Cat();
            animal.speak();
        } else if (choice == 2){
            animal = new Dog();
            animal.speak();
        } else {
            System.out.println("Invalid input");
        }


    }
}