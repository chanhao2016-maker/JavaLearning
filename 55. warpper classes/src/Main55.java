
public class Main55 {
    public static void main (String[] args){

        // Wrapper class = Allow primitive values(int, char, double, boolean)
        //                 to be used as objects. "Wrap them in object"
        //                 Generally, don't wrap primitives unless you need an object.
        //                 Allows use of Collections Framework and static Utility Methods.

        // Integer a = new Integer(808);
        Integer a = 808;

        // Double b = new Double(20.5);
        Double b = 20.5;

        // Character c = new Character('$');
        Character c = '$';

        // Boolean d = new Boolean(true)
        Boolean d = true;

        String e = "Batman";

        // Unboxing
        int x = a;

        String a1 = Integer.toString(123);
        String b1 = Double.toString(3.14);
        String c1 = Character.toString('@');
        String d1 = Boolean.toString(false);

        String y = a1 + b1 + c1 + d1;
        System.out.println(y);

        int a2 = Integer.parseInt("123");
        double b2 = Double.parseDouble("3.14");
        char c2 = "@".charAt(0);
        boolean d2 = Boolean.parseBoolean("false");

        char letter = 'B';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));



    }
}