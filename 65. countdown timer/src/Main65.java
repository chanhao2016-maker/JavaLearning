import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main65 {
    public static void main(String[] args){

        // JAVA COUNTDOWN TIMER PROGRAM

        Timer timer = new Timer();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the countdown time: ");
        int response = scanner.nextInt();

        TimerTask task = new TimerTask(){

            int count = response;

            @Override
            public void run(){

                System.out.println(count);
                count--;
                if(count <= 0){
                    System.out.println("Happy Birthday! ");
                    timer.cancel();
                }

            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); //(task, delay, period);
    }
}