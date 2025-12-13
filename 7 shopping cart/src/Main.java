import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        // if statement = performs a block of code if its condition is true

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student (true/false): ");
        isStudent = scanner.nextBoolean();

        //GROUP 1

        if(name.isEmpty()){
            System.out.println("You didn't enter your name!🤬");
        }

        else{
            System.out.println("Hello " + name + " ! 👍");
        }


        //GROUP 2

        if (age > 100){
            System.out.println("You are a Vampire🧛‍♂️");
        }

        else if (age >= 65){
            System.out.println("You are a senior🎅 ");
        }

        else if(age >= 18){
            System.out.println("You are an adult🧔‍♂️");
        }

        // 1个 = 相等于assignment, == 两个等于相等于数学的相等
        else if(age == 0){
            System.out.println("You are a baby👩‍🍼 ");
        }


        else if(age < 0){
            System.out.println("You haven't been born yet🤰 ");
        }

        // else 是以上的if 都不符合的情况下的归类

        else{
            System.out.println("You are a child");
        }

        //GROUP 3

        if(isStudent){
            System.out.println("You are a student");
        }

        else{
            System.out.println("You are a not a student");
        }

        scanner.close();

    }

}