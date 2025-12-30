import java.util.Scanner;

public class Main36Me {

    static Scanner scanner = new Scanner(System.in);

    static int score = 0;

    static String[] questions = {"What is the main function of a router?",
            "Which part of the computer is considered the brain?",
            "What year was facebook launched?",
            "Who is known as the father of computer?",
            "What is the first programming language?", };

    static String[][] options = {{"A. Storing files", "B. Encrypting data", "C. Directing internet traffic", "D. Managing Password"},
            {"A. CPU", "B. Hard Drive", "C. RAM", "D. GPU"},
            {"A. 2000", "B. 2004", "C. 2006", "D. 2008"},
            {"A. Steve Jobs", "B. Bill Gates", "C. ALan Turing", "D. Charles Babbage"},
            {"A. COBOL", "B. C", "C. Fortran", "D. Assembly"}};

    static String[] answer = {"C","A","B","D","C"};

    public static void main(String []args){

        for (int i = 0; i < questions.length; i++){
            printQuestion(questions[i], options[i]);

            System.out.print("Enter your answer: ");
            String ans = scanner.nextLine();

            ;

            if(checkAnswer(ans, answer[i])){
                score++;
            }
            else {
                System.out.println("Rock!");
            }
        }

        System.out.println("You have score " + score + " out of " + questions.length);

    }



    static void printQuestion (String q, String[] opts){

        System.out.println(q);
        for (String opt : opts){
            System.out.println(opt);
        }

    }

    static boolean checkAnswer(String input, String ans){
        if (input.equalsIgnoreCase(ans)){
            System.out.println("Carrot!");
            return true;
        }
        else{
            return false;
        }
    }

}
