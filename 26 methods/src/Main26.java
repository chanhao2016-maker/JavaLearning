
public class Main26{
    public static void main(String[]args){

        // method = a block of reusable code that is executed when called()

        String name = "Chan hao";
        int age = 24;
        happyBirthday(name, age);

        double cube = cube(3);
        System.out.println(cube(3));

        String fullName = getFullName("Spiderman", "Spiderweb");
        System.out.println(fullName);

        int ageNew = 21;
        if (ageCheck(age)) {
            System.out.println("You may sign up!");
        }
        else{
            System.out.println("You must be 18+ to sign up");
        }
    }
    static void happyBirthday(String birthdayboi, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday to %s\n",birthdayboi);
        System.out.printf("You are %d years old!\n",age);
        System.out.println("Happy Birthday to you!\n");

    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int ageNew){
        if (ageNew >= 18) {
            return true;
        }
        else{
            return false;
        }
    }
}