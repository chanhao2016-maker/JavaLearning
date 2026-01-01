public class Car {

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.52;
    boolean isRunning = false;

    void start(){
        System.out.println("Krr-krr-VROOOOM!");
        isRunning = true;
    }

    void stop(){
        isRunning = false;
        System.out.println("Vrrr... whirrr... put-put... [Silence]");
    }

    void drive(){
        System.out.println("VRRRAAAAAHHHHHH!");
    }

    void turbo(){
        System.out.println("Stutututu... Pshhh!");
    }

    void tooFast(){
        System.out.println("NNNNEEEEEOOOOOWWWWW!");
    }
    void brake(){
        System.out.println("SKRRRRRRRT!");
    }
}
