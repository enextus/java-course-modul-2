package lesson03.hw03;

import lesson02.hw02.Book;

/**
 * Class Book Test
 */
public class BookTest {
    public static void main(String[] args) {
        Book bookOne = new Book(1, "Leo Tolstoy", "War and Peace", 1869);
        Book bookTwo = new Book(2, "Jane Austen", "Pride and Prejudice", 1813);
        Book bookThree = new Book(3, "Dante Alighieri", "Divine Comedy", 1321);
        Book bookFour = new Book(4, "Joshua Bloch", "Effective Java", 2001);

        Book bookFive = new Book(5, "George Orwell", "1984",
                1949, "Dystopian, political fiction, social science fiction",
                "English", "soft", 56456, "978-3-86680-134-9");

        Book bookSix = new Book(6, "Mark Twain", "The Adventures of Huckleberry Finn",
                1884, "Picaresque novel", "English",
                "hard", 10456, "978-3-86680-188-9");

        Book bookSeven = new Book(7, "Leo Tolstoy", "Anna Karenina",
                1878, "Realist novel", "russian",
                "hard", 20456, "978-3-86680-192-9");

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
        bookSeven.setBookmark(23);
        bookSeven.displayBookmark();
    }
}
