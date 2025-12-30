import java.util.Random;
import java.util.Scanner;

public class Main37 {
    public static void main(String[]args){

        // ROCK PAPER SCISSORS GAME

        // DECLARE VARIABLES

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        // GET CHOICE FROM THE USER
        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")){
                System.out.println("Invalid choice");
                continue;
            }

            // GET RANDOM CHOICE FOR THE COMPUTER

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            // CHECK WIN CONDITION

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }
            else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper") )){
                System.out.println("You Won!");
            }

            else {
                System.out.println("You Lose!");
            }

            // ASK TO PLAY AGAIN?

            System.out.print("Play again (Yes/No): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while(playAgain.equals("yes"));

        System.out.println("Good~ Byee");

        // GOODBYE MESSAGE

        scanner.close();
    }
}