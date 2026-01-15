import java.util.ArrayList;
import java.util.Collections;

public class Main56 {
    public static void main(String[]args) {

        // ArrayList = A resizeable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayLists can change.

        ArrayList<String> superHero = new ArrayList<>();

        superHero.add("Superman");
        superHero.add("Spiderman");
        superHero.add("Watermelon");
        superHero.add("Banana");

        // superHero.remove(1);
        superHero.set(0, "Batman");

        System.out.println(superHero.get(0));
        System.out.println(superHero.size());

        Collections.sort(superHero);
        System.out.println(superHero);

        for (String hero : superHero){
            System.out.println(hero);
        }
    }
}