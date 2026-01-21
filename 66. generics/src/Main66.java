import java.util.ArrayList;

public class Main66 {
    public static void main(String[] args){

        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type
        //            <String> type argument (specifies the type)

        Box<Integer> box = new Box<>();

        box.setItem(1000);
        System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("Ice Cream", 5.99);
        Product<String, Integer> product2 = new Product<>("ticket", 15);


        System.out.println(product2.getPrice());



    }
}