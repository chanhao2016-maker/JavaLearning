
public class Main {
    public static void main(String [] args){

        // Arithmetic Operators

        int x = 10;
        int y = 2;
        int z;

        z = x + y;

        System.out.println("z: " + z);

        int a = 10;
        int b = 2;

        //a = a + b;
        //a -= b;
        //a *= b;
        //a /= b;
        //a %= b:

        a += b;
        System.out.println("a: " + a);

        // Increment and Decrement Operators

        int c = 1;

        //c = c + 1;
        //c += 1;

        c++;
        c++;
        c--;

        System.out.println("c: " + c);

        // ORDER OF OPERATIONS [P-E-M-D-A-S]

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println("result: " + result);










    }
}