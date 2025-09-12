package org.myLibrary.com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Library class.
 */
class LibraryTest {

    private LibraryManagement libbook;
    private Book nineteenEightyFour;
    private Book theHobbit;

    @BeforeEach
    void setUp() {
        libbook = new LibraryManagement();
        nineteenEightyFour = new Book("1984", "George Orwell", "ISBN001");
        theHobbit = new Book("The Hobbit", "J.R.R. Tolkien", "ISBN002");
        libbook.addBookToLib(nineteenEightyFour);
        libbook.addBookToLib(theHobbit);
    }

    /**
     * Verifies that adding a book to the library works
     */
    @Test
    void testAddBook() {
        // Given
        Book cleanCode = new Book("Clean Code", "Robert C. Martin", "ISBN003");

        // When
        libbook.addBookToLib(cleanCode);

        // Then
        Book found = libbook.findBookwithIsbn("ISBN003");
        assertNotNull(found, "Book should be added and found in the catalog");
        assertEquals("Clean Code", found.getTitle());
    }

    /**
     * Tests searching for books by ISBN.
     */
    @Test
    void testSearchBook() {
        // Test existing book
        Book found = libbook.findBookwithIsbn("ISBN001");
        assertNotNull(found, "Book with ISBN001 should exist");
        assertEquals("1984", found.getTitle());

        // Test non-existent book
        Book notFound = libbook.findBookwithIsbn("ISBN001");
        assertNull(notFound, "Book with ISBN999 should not exist");
    }

    /**
     * Verifies issuing and returning a book works
     */
    @Test
    void testIssueAndReturnBook() {
        // Verify initial state
        Book book = libbook.findBookwithIsbn("ISBN001");
        assertTrue(book.isAvailable(), "Book should be available before issuing");

        // Issue the book
        libbook.issueBook("ISBN001");

        // Verify book is not available
        book = libbook.findBookwithIsbn("ISBN001");
        assertFalse(book.isAvailable(), "Book should not be available after issuing");

        // Return the book
        libbook.returnBook("ISBN001");

        // Verify book is available a
        book = libbook.findBookwithIsbn("ISBN001");
        assertTrue(book.isAvailable(), "Book should be available again after returning");
    }
}
