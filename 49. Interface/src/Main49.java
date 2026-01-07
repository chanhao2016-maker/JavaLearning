public class Main49 {
    public static void main(String [] args){

        // Interface = A blueprint for a class that specifies a set of abstract methods
        //             that Implementing classes must define
        //             Supports multiple inheritance-like behavior.

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();

        rabbit.flee();
        hawk.hunt();

    }
}