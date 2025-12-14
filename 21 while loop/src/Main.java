import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        // While loop = repeat some code forever
        //              while some condition remains true

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        /* while(1 == 1){
               System.out.print("I'm stuck");
         }
         */

        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("Click a random character until you quick the loop: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have Won!");

        scanner.close();



    }
        }