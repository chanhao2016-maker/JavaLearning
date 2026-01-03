
public class Main42 {
    public static void main(String [] args){
         /*Car car1 = new Car("Lamborgini", "Grey");
         Car car2 = new Car("Avanza", "Blue");
         Car car3 = new Car("Proton Saga", "Gold");

          */

         Car[] cars = {new Car("Lamborgini", "Grey"),
                       new Car("Avanza", "Blue"),
                       new Car("Proton Saga", "Gold")};

         for (Car car : cars){
            car.color = "black";
         }

         for (Car car : cars){
             car.drive();
         }
    }
}