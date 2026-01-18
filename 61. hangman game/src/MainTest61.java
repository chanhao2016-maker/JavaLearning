import java.util.Scanner;

public class MainTest61 {
    public static void main(String[] args) {

        // Java Hangman Game (String[]) try try
        String word = "superman";

        Scanner scanner = new Scanner(System.in);
        Character[] wordState = {'_', '_','_','_', '_','_', '_', '_'};
        int wrongGuesses = 0;

        System.out.println("************************");
        System.out.println("Welcome to JAVA Hangman!");
        System.out.println("************************");


        while (wrongGuesses < 6) {

            System.out.println(getHangmanArt(wrongGuesses));

            for (char w : wordState) {
                System.out.print(w + " ");
            }

            System.out.println();
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0){
                System.out.println("Correct Guess!");

                for (int i = 0; i < word.length(); i++){
                    if (word.charAt(i) == guess){
                        wordState[i] = guess;
                    }
                }
            }

            else {
                wrongGuesses++;
                System.out.println("Wrong Guess!");
            }

            boolean isWin = true;

// 2. 遍历检查每一个格子
            for (int i = 0; i < wordState.length; i++) {
                if (wordState[i] == '_') { // 只要发现还有一个下划线
                    isWin = false; // 推翻假设，还没赢
                    break;         // 既然找到了一个空位，后面就不用看了，直接跳出检查
                }
            }

// 3. 根据结果判断
            if (isWin) {
                System.out.println(getHangmanArt(wrongGuesses));
                System.out.println("The # of wrong guesses: " + wrongGuesses);
                System.out.println("You WIN!");
                System.out.println("The word was everybody favourite hero ----> superman!");;
                break; // 跳出最外面的 while 游戏循环，游戏结束
            }
        }



        if(wrongGuesses >= 6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was: Everybody favourite hero ----> superman!");
        }

        scanner.close();


    } static String getHangmanArt(int wrongGuesses){
        return switch(wrongGuesses){
            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                     o
                    
                    
                    """;
            case 2 -> """
                     o
                     |
                    
                    """;
            case 3 -> """
                     o
                    /|
                    
                    """;
            case 4 -> """
                     o
                    /|\\
                    
                    """;
            case 5 -> """
                     o
                    /|\\
                    /
                    """;
            case 6 -> """
                     o
                    /|\\
                    / \\
                    """;
            default -> "";
        };
    }

}








