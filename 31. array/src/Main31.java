import java.util.Arrays;

public class Main31{
    public static void main(String[]args) {

        String[] fruits = {"apple", "orange", "pineapple", "watermelon","papaya"};

        fruits[0] = "alibaba";
        int numOfFruits = fruits.length;

        System.out.println(fruits[0]);
        System.out.println(numOfFruits);

        Arrays.sort(fruits);
        Arrays.fill(fruits, "banana");

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
