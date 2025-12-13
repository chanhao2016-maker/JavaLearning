
public class Main {
    public static void main(String[] args){

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier.character]

        String name = "Spongebob";
        char firstletter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n" , firstletter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        //[.precision]

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%.2f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.2f\n", price3);

        // [flags]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price4 = 9000.99;
        double price5 = 100000.15;
        double price6 = -54000.01;

        System.out.printf("%,.2f\n", price4);
        System.out.printf("%,.2f\n", price5);
        System.out.printf("% ,.2f\n", price6);

        // [width/padding]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        int id5 = 1;
        int id6 = 23;
        int id7 = 456;
        int id8 = 7890;

        System.out.printf("%4d\n", id5);
        System.out.printf("%4d\n", id6);
        System.out.printf("%4d\n", id7);
        System.out.printf("%4d\n", id8);

        int ia1 = 1;
        int ia2 = 23;
        int ia3 = 456;
        int ia4 = 7890;

        System.out.printf("%-4d\n", ia1);
        System.out.printf("%-4d\n", ia2);
        System.out.printf("%-4d\n", ia3);
        System.out.printf("%-4d\n", ia4);





    }
}