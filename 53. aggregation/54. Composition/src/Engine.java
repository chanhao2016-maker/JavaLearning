public class Engine {

    String type;

    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println("You starts the " + this.type + " engine");
    }
}
