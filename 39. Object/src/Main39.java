
public class Main39{
    public static void main(String[]args){

        Car car = new Car();

        System.out.printf("This %s is moving\n", car.model);
        car.start();
        car.drive();
        car.drive();
        car.turbo();
        car.tooFast();
        car.brake();
        car.stop();


    }
}