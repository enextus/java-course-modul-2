package lesson02.hw02;

public class Book {

    /**
     * Class Book
     *
     * Test:
     * The ID is: 1
     * The author is: Leo Tolstoy
     * The height is: War and Peace
     * The BMI is: 1869
     *
     * The ID is: 2
     * The author is: Jane Austen
     * The height is: Pride and Prejudice
     * The BMI is: 1813
     *
     * The ID is: 3
     * The author is: Dante Alighieri
     * The height is: Divine Comedy
     * The BMI is: 1321
     *
     * The ID is: 4
     * The author is: Joshua Bloch
     * The height is: Effective Java
     * The BMI is: 2001
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
        System.out.println();

        bookTwo.displayInfo();
        System.out.println();

        bookThree.displayInfo();
        System.out.println();

        bookFour.displayInfo();
    }
}
