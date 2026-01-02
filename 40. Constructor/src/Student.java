public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa){

        this.name = name;
        // Student.name = name;

        this.age = age;
        // Student.age = age;

        this.gpa = gpa;
        // Student.gpa = gpa;

        this.isEnrolled = true;

    }

    void study(){
        System.out.println(this.name + " is studying ");
    }
}
