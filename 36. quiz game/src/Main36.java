import java.util.Scanner;

public class Main36 {
    public static void main(String[]args){
        // JAVA QUIZ GAME

        String[] questions = {"What is the main function of a router?",
                               "Which part of the computer is considered the brain?",
                               "What year was facebook launched",
                               "Who is known as the father of computer?",
                               "What is the first programming language?"};

        questionss();

        // QUESTIONS ARRAY[]

        String[][] options = {{"A. Storing files", "B. Encrypting data", "C. Directing internet traffic", "D. Managing Password"},
                              {"A. CPU", "B. Hard Drive", "C. RAM", "D. GPU"},
                              {"A. 2000", "B. 2004", "C. 2006", "D. 2008"},
                              {"A. Steve Jobs", "B. Bill Gates", "C. ALan Turing", "D. Charles Babbage"},
                              {"A. COBOL", "B. C", "C. Fortran", "D. Assembly"}};

        // OPTIONS ARRAY[][]

        String[] answers = {"C","A","B","D","C"};
        int score = 0;
        String guess;

        Scanner scanner = new Scanner(System.in);


        // DECLARE VARIABLES
        System.out.println("------------------------------");
        System.out.println("Welcome to the JAVA Quiz Game!");
        System.out.println("------------------------------");

        // WELCOME MESSAGE

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextLine();

            if(guess.equalsIgnoreCase(answers[i])){
                System.out.println("********");
                System.out.println("Correct!");
                System.out.println("********");
                score++;
            } else {
                System.out.println("******");
                System.out.println("Wrong!");
                System.out.println("******");
            }
        }

        System.out.println("Your final score is " + score + " out of " + questions.length);

        // QUESTION (Loop)

        //  OPTIONS
        //  GET GUESS FROM USER
        //  CHECK OUR GUESS
        // DISPLAY FINAL SCORE

        scanner.close();
    }

    static void questionss() {
        System.out.println("What is the main function of a router?");
        System.out.println("Which part of the computer is considered the brain?");
        System.out.println("What year was facebook launched?");
        System.out.println("Who is known as the father of computer");
        System.out.println("What is the first programming language?");
    }


}

