import java.util.Scanner;


public class Main{
    public static void main(String[] args){

        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        double result;

        // pow = 次方

        result = Math.pow(2, 4);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(4.64);
        result = Math.ceil(3.1); // always round up
        result = Math.floor(3.6); // always round down
        result = Math.max(10, 7);
        result = Math.min(1, 8);

        System.out.println(result);

        // HYPOTENUSE c = Math.sqrt(a² + b²)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Lets calculate the Triangle 毕氏定理");

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The length of C is: " + c + "cm");

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
        // 计算圆形

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.println("Lets Calculate the Circle");

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius; // 周长
        area = Math.PI * Math.pow(radius, 2); // 面积
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); //球体体积

        System.out.printf("The circumference is: %.1f\n" , circumference);
        System.out.printf("The area is: %.1f\n" , area);
        System.out.printf("The volume is: %.1f\n" , volume);



        scanner.close();
    }

}