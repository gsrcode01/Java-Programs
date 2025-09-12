package org.myLibrary.com;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryManagement libbook = new LibraryManagement();

        while (true) {
            libMenu();
            int Ch = sc.nextInt();
            sc.nextLine();

            switch (Ch) {
                case 1:
                    addBook(sc, libbook);
                    break;
                case 2:
                    libbook.displayAllBooks();
                    break;
                case 3:
                    issueBook(sc, libbook);
                    break;
                case 4:
                    returnBook(sc, libbook);
                    break;
                case 0:
                    System.out.println("Exiting the library. Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice! Please enter 0-4.");
            }
        }
    }
    //Library Menu
    public static void libMenu(){
        System.out.println("\n------LIBRARY MENU------");
        System.out.println("1. To Add Book");
        System.out.println("2. To Show All Books");
        System.out.println("3. To Issue book");
        System.out.println("4. To Return book");
        System.out.println("0. To Exit");
    }

    private static void addBook(Scanner scanner, LibraryManagement libbook) {
        System.out.print("Enter the Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter the Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Book ISBN: ");
        String isbn = scanner.nextLine();

        // Consider ISBN format
        libbook.addBookToLib(new Book(title, author, isbn));
    }

    private static void issueBook(Scanner scanner, LibraryManagement libbook) {
        System.out.print("Enter ISBN to Issue: ");
        String issueISBN = scanner.nextLine();
        libbook.issueBook(issueISBN);
    }

    private static void returnBook(Scanner scanner, LibraryManagement libbook) {
        System.out.print("Enter ISBN to Return: ");
        String returnISBN = scanner.nextLine();
        libbook.returnBook(returnISBN);
    }
}


