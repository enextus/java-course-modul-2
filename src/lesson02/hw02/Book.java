package lesson02.hw02;

public class Book {

    /**
     * Class Book
     */

    int id;
    String author;
    String title;
    int year;


    public Book(int bookId, String bookAuthor, String bookTitle, int bookYear) {
        id = bookId;
        author = bookAuthor;
        title = bookTitle;
        year = bookYear;
    }

    public void displayInfo() {
        System.out.println("The ID is: " + id);
        System.out.println("The author is: " + author);
        System.out.println("The height is: " + title);
        System.out.println("The BMI is: " + year);
    }
}


class BookTest {
    public static void main(String[] args) {
        Book bookOne = new Book(1, "Leo Tolstoy", "War and Peace", 1869);
        Book bookTwo = new Book(2, "Jane Austen", "Pride and Prejudice", 1813);
        Book bookThree = new Book(3, "Dante Alighieri", "Divine Comedy", 1321);
        Book bookFour = new Book(4, "Joshua Bloch", "Effective Java", 2001);


        bookOne.displayInfo();
        bookTwo.displayInfo();
        bookThree.displayInfo();
        bookFour.displayInfo();
    }
}