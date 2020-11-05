package lesson02.hw02;

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
    private int bookmark;

    public Book(int bookId,
                String bookAuthor,
                String bookTitle,
                int bookYear) {

        this.id = bookId;
        this.author = bookAuthor;
        this.title = bookTitle;
        this.year = bookYear;
        this.bookmark = 0;
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

    public void setBookmark(int bookmark) {
        this.bookmark = bookmark;
    }

    public int getBookmark() {
        return this.bookmark;
    }

    public void displayBookmark() {
        System.out.println("The bookmark is on site: " + this.getBookmark());
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