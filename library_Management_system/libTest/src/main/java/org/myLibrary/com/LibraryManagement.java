package org.myLibrary.com;
import java.util.ArrayList;

public class LibraryManagement{

    // Collection of books

    private ArrayList<Book> libbook;

    //Arraylist-It dynamically increase or decrease the size of Array.
    //libbook-Library Books

    // Constructor
    public LibraryManagement() {
        libbook = new ArrayList<>();
    }

    /**
     * Adds a book to the library
     * @param book The book to add
     */
    public void addBookToLib(Book book) {
        libbook.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    /**
     * Searches for a book by ISBN.
     * @param isbn to Search the book
     * @return The book if found, null otherwise
     */
    public Book findBookwithIsbn(String isbn) {
        for (Book book : libbook) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    /**
     * Issues a book to a User.
     * @param isbn user Issue Book
     */
    public void issueBook(String isbn) {
        Book book = findBookwithIsbn(isbn);
        if (book != null) {
            book.issueBook();
        } else {
            System.out.println("Book not found of ISBN: " + isbn);
        }
    }

    /**
     * Returns a book from a User.
     * @param isbn user return the book.
     */
    public void returnBook(String isbn) {
        Book book = findBookwithIsbn(isbn);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book not found of ISBN: " + isbn);
        }
    }

    /**
     * Displays all books in the library Books.
     */

    public void displayAllBooks() {
        if (libbook.isEmpty()) {
            System.out.println("Library is empty.");
        } else {
            for (Book book : libbook) {
                System.out.println(book);
            }
        }
    }
}
