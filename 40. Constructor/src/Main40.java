
public class Main40 {
    public static void main(String[]args){

        // constructor = A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values

        Student student1 = new Student("Jackie", 19, 3.5);
        Student student2 = new Student("Bruce", 24, 3.6);
        Student student3 = new Student("Bob", 30, 3.5);

       student1.study();
       student1.notifyAll();


    }
}