
public class Main52 {
    public static void main(String[]args){

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Car car = new Car("Volkswagen" , "White", 100000);

        car.setColor("Yellow");
        car.setPrice(0);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}