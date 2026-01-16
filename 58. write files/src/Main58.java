import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main58 {
    public static void main(String[] args){
        // How to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, liked reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String filePath = "C:\\Users\\HP\\OneDrive\\Desktop\\test.txt";
        String textContent = """
                16-1-2026
                As usual I am learning programming language
                main is Java and Solidity
                I am feeling good, but personal relationship not so good
                why not?
                because I don't want meet to many people specifically others,
                but I afraid I will hurt their feelings but I guess people gets hurts
                so just be myself don't worry others, let them do their homework.
                """;
        
        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written.");
        }
        catch(FileNotFoundException e) {
            System.out.println("File path is not invalid.");
        }

        catch(IOException e) {
            System.out.println("Could not write file");
        }

    }
}