import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        // While loop = repeat some code forever
        //              while some condition remains true

        Scanner scanner = new Scanner(System.in);

        /*String name = "";

        while(name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        while(1 == 1){
               System.out.print("I'm stuck");
         }

         */


        /*String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("Click a random character until you quick the loop: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have Won!");

         */








        // while 的话是当条件符合才会进入loop
        // do- while 的话, 先do 条件, 过后才进loop





        /*int age = 0;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while(age<0) {
            System.out.println("If you type negative you will be in the infinite sukiyomi");
            System.out.println("So enter again your age (wisely): ");
            age = scanner.nextInt();


            if (age < 0) {
                System.out.println("Mangekyo sharingannnnnn");
                System.out.println("nnnnnnnnnnnnnnnnnnnnnnn");
                System.out.println("nnnnnnnnnnnnnnnnnnnnnnn");
                System.out.println("nnnnnnnnnnnnnnnnnnnnnnn");
                System.out.println("nnnnnnnnnnnnnnnnnnnnnnn");
                System.out.println("nnnnnnnnnnnnnnnnnnnnnnn");
                System.out.println("nnnnnnnnnnnnnnnnnnnnnnn");
                System.out.println("nnnnnnnnnnnnnnnnnnnnnnn");
                System.out.println("nnnnnnnnnnnnnnnnnnnnnnn");
                System.out.print("This is your last chance: ");
                age = scanner.nextInt();

            }

        }


        System.out.println("You are " + age + " years old");

         */

        int number =0;

       do {
            System.out.print("Enter a number between 1-10:");
            number = scanner.nextInt();
        }while(number<1 || number>10);

        System.out.println("You picked " + number);

        scanner.close();

    }
        }