package lesson02.hw02;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class Book
 */
public class Book {
    int id;
    String author;
    String title;
    int year;
    String genre;
    String language;
    String cover;
    int citationIndex;
    String isbn;
    String ts;

    public Book(int bookId,
                String bookAuthor,
                String bookTitle,
                int bookYear) {

        this.id = bookId;
        this.author = bookAuthor;
        this.title = bookTitle;
        this.year = bookYear;

        this.ts = getTimestamp();
    }

    public static String getTimestamp() {

        return new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(new Date());
    }

    public Book(int bookId,
                String bookAuthor,
                String bookTitle,
                int bookYear,
                String bookGenre,
                String bookLanguage,
                String bookCover,
                int bookCitationIndex,
                String bookIsbn) {

        this.id = bookId;
        this.author = bookAuthor;
        this.title = bookTitle;
        this.year = bookYear;

        this.genre = bookGenre;
        this.language = bookLanguage;
        this.cover = bookCover;
        this.citationIndex = bookCitationIndex;
        this.isbn = bookIsbn;

        this.ts = getTimestamp();
    }

    public void displayInfo() {
        System.out.println("The ID is: " + this.id);
        System.out.println("The author is: " + this.author);
        System.out.println("The title is: " + this.title);
        System.out.println("The publication year is: " + this.year);

        if (this.genre != null) System.out.println("The genre is: " + this.genre);
        if (this.language != null) System.out.println("The language is: " + this.language);
        if (this.cover != null) System.out.println("The cover is: " + this.cover);

        System.out.println("Timestamp: " + this.ts);
    }
}

class BookTest {
    public static void main(String[] args) {
        Book bookOne = new Book(1, "Leo Tolstoy", "War and Peace", 1869);
        Book bookTwo = new Book(2, "Jane Austen", "Pride and Prejudice", 1813);
        Book bookThree = new Book(3, "Dante Alighieri", "Divine Comedy", 1321);
        Book bookFour = new Book(4, "Joshua Bloch", "Effective Java", 2001);

        Book bookFive = new Book(5, "George Orwell", "1984", 1949, "Dystopian, political fiction, social science fiction", "English", "soft", 56456, "978-3-86680-134-9");
        Book bookSix = new Book(6, "Mark Twain", "The Adventures of Huckleberry Finn", 1884, "Picaresque novel", "English", "hard", 10456, "978-3-86680-188-9");
        Book bookSeven = new Book(7, "Leo Tolstoy", "Anna Karenina", 1878, "Realist novel", "russian", "hard", 20456, "978-3-86680-192-9");

        bookOne.displayInfo();
        System.out.println();

        bookTwo.displayInfo();
        System.out.println();

        bookThree.displayInfo();
        System.out.println();

        bookFour.displayInfo();
        System.out.println();

        bookFive.displayInfo();
        System.out.println();

        bookSix.displayInfo();
        System.out.println();

        bookSeven.displayInfo();
    }
}
