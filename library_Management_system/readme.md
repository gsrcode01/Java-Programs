# Library Management System (Java Console)

A beginner-friendly **Library Management System** built in Java. This program allows users to add, view, issue, and return books using a simple console interface. It demonstrates basic object-oriented principles like classes, interfaces, and method encapsulation.

---

## Features
- Add new books with title, author, and ISBN.
- List all available books.
- Issue and return books, with availability tracking.
- Easy-to-use console menu.

---

## Setup Instructions
### Requirements
- Java Development Kit (JDK) 8 or newer.
- A code editor or IDE (Eclipse, IntelliJ IDEA, VS Code, etc.).
- Git (optional, for version control).

### Steps to Run
1. Clone or download the project.
2. Ensure the folder structure matches the package: `org/myLibrary/com/`.
3. Open a terminal in the project root folder.
4. Compile the code:
```bash
javac org/myLibrary/com/*.java
```
5. Run the program:
```bash
java org.myLibrary.com.Main
```

### Running in an IDE
- Import the project as a Java project.
- Ensure `src` folder contains `org/myLibrary/com/`.
- Run `Main.java`.

---

## Usage
After starting the program, you’ll see a menu:
```
------LIBRARY MENU------
1. Add Book
2. Show All Books
3. Issue Book
4. Return Book
0. Exit
```
- **1** → Add a new book (enter title, author, ISBN).
- **2** → Display all books in the library.
- **3** → Issue a book by entering its ISBN.
- **4** → Return a book by entering its ISBN.
- **0** → Exit the program.

> Tip: Enter numbers only when selecting menu options.

---

## Running Tests (JUnit)
If unit tests are included:
1. Make sure JUnit 5 is installed or configured in your IDE.
2. Run the test class (e.g., `BookTest.java`) to verify `issueBook()`, `returnBook()`, and `isAvailable()` functionality.

---

## Benefits
- Learn Java object-oriented programming and interfaces.
- Understand how to track and manage book availability.
- Get hands-on experience with console input/output.
- Prepare for adding features like file persistence or GUI in future enhancements.

---

## Next Steps / Enhancements
- Prevent duplicate ISBN entries.
- Add member management and due dates.
- Save and load books from a file for persistence.
- Improve user input validation.
- Implement a graphical user interface (GUI) for better experience.

---

✅ This project is perfect for beginners to explore Java programming and library management concepts in a simple, interactive way.

