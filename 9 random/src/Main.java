import java.util.Random;

public class Main{
    public static void main(String[] args){

        Random random = new Random();

        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(0, 101);
        number2 = random.nextInt(0, 101);
        number3 = random.nextInt(0, 101);

        System.out.println("Random numbers: ");
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        //Random Doubles

        double 小数点1;
        double 小数点2;
        double 小数点3;

        System.out.println("随机小数点: ");
        小数点1 = random.nextDouble(0.00, 100.00);
        小数点2 = random.nextDouble(0.00, 100.00);
        小数点3 = random.nextDouble(0.00, 100.00);

        System.out.println(小数点1);
        System.out.println(小数点2);
        System.out.println(小数点3);

        //Boolean

        boolean isHeads;

        isHeads = random.nextBoolean();
        System.out.println("Random (True/False): ");

        if (isHeads) {
            System.out.println("Heads");
        }

        else {
            System.out.println("Tails");
        }









    }

}