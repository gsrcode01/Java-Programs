package org.myLibrary.com;

public class Book implements Issueable {

    // Instance variables for book details
    private String bookTitle;
    private String bookAuthor;
    private String bookISBN;
    private boolean Available;

    /**
     * Constructor for creating a new Book instance.
     *
     * @param title  of the book.
     * @param author of the book.
     * @param isbn   of the book.
     */
    public Book(String title, String author, String isbn) {
        this.bookTitle = title;
        this.bookAuthor = author;
        this.bookISBN = isbn;
        this.Available = true; // Assume book is available when added
    }

    // Getter methods for book details
    public String getTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return bookAuthor;
    }

    public String getIsbn() {
        return bookISBN;
    }

    public boolean isAvailable() {
        return Available;
    }

// Implementing Issueable interface methods
    @Override
    public void issueBook() {
        if (Available) {
            Available = false;
            System.out.println("Issued Book: " + bookTitle);
        } else {
            System.out.println(bookTitle + " is currently not available.");
        }
    }

    @Override
    public void returnBook() {
        if (!Available) {
            Available = true;
            System.out.println("Returned Book: " + bookTitle);
        } else {
            System.out.println(bookTitle + " was not issued.");
        }
    }

    // Display book details
    public void displayDetails() {
        System.out.println("[Title:"+bookTitle+",Author:"+bookAuthor+",ISBN:"+bookISBN+",Available:"+Available+"]");
    }
}
