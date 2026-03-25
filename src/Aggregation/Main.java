package Aggregation;

public class Main {
    public static void main(String[] args){
//        Aggregation = Represents a "has-a" relationship between objects.
//                One object contains another object as part of its structure,
//                but the contained object/s can exist independently
        Book book1 = new Book("Harry Potter", 100);
        Book book2 = new Book("The Two Towers", 320);
        Book book3 = new Book("The King", 198);

        Book[] books = {book1, book2, book3};
        for(Book book: books){
            System.out.println(book.displayInfo());
        }
        Library library = new Library("NYC Public Library", 1897, books);
        library.displayInfo();
        for(Book book: books){
            System.out.println(book.displayInfo());
        }
    }
}
