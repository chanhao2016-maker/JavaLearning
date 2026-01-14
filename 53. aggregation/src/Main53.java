
public class Main53 {
    public static void main(String[]args){

        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contains another object as part of its structure,
        //               but the contained object/s can exist independently.

        Book book1 = new Book("Walden Lake",360);
        Book book2 = new Book("Harry Potter",500);
        Book book3 = new Book("3 Dimension",450);

        Book[] books = {book1, book2, book3};

        Library library1 = new Library("Kuala Lumpur Library", 1989, books);

        library1.displayInfo();

    }
}