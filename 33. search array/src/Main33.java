import java.util.Scanner;

public class Main33{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 9, 8, 28, 19};
        String[] fruits = {"apple", "orange", "banana"};
        System.out.print("Enter a fruit to search for: ");
        String target = scanner.nextLine();

        boolean isFound = false;

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i );
                isFound  = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array");
        }
    }
}