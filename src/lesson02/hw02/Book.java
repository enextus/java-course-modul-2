package lesson02.hw02;

import lesson02.Person;

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
        Book bookOne = new Book(1, "Tolstoj", "War and Peace", 1900);

        bookOne.displayInfo();
    }
}