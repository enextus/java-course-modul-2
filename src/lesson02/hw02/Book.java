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


    public Book(int ID, String bookAuthor, String bookTitle, int bookYear) {
        id = ID;
        author = bookAuthor;
        title = bookTitle;
        year = bookYear;
    }
}


class BookTest {
    public static void main(String[] args) {
        Book bookOne = new Book(1, "Tolstoj", "War and Peace", 1900);

        bookOne.displayInfo();
    }
}