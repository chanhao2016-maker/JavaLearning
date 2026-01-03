
public class Main45 {
    public static void main(String[]args){

        // super = refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        Person person = new Person("Tabby", "Cat");
        Student student = new Student("Harry", "Potter", 3.85);
        Employee employee = new Employee("海绵", "宝宝", 2500);

        person.showName();
        student.showGPA();
        employee.showSalary();
    }
}