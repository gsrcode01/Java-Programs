
# Ticket Counter Stack System

## Project Overview
This project simulates a **ticket counter system** using a stack data structure to manage `Person` objects. Users can push or pop persons from the stack, display all persons, or view the top `n` persons. The stack supports initialization either as empty with a specified size or directly from an array of persons.

Key features:
- Stack implementation for `Person` objects.
- Support for single and multiple push operations.
- Pop operations for single or multiple persons.
- Display all persons or top `n` persons.
- Enum-based gender representation for `Person`.

## Installation Instructions
1. **Prerequisites:**
   - Java JDK 8 or higher installed.
   - A Java IDE or text editor (e.g., IntelliJ IDEA, Eclipse, VS Code).

2. **Clone or download the project files** to your local machine.

3. **Compile the code:**
   Open a terminal in the project directory and run:
   ```bash
   javac ticket_counter/*.java
   ```

4. **Run the main class:**
   ```bash
   java ticket_counter.Main
   ```

## Usage Guidelines
1. **Initialize the stack:**
   - Option 1: Empty stack with a specific size.
   - Option 2: Initialize with an array of `Person` objects.

2. **Push persons to the stack:**
   - Single push:
     ```java
     st.push(new Person("Alice", 25, Person.Gender.FEMALE));
     ```
   - Push two persons at once:
     ```java
     st.push(person1, person2);
     ```

3. **Pop persons from the stack:**
   - Single pop:
     ```java
     Person p = st.pop();
     p.display();
     ```
   - Multiple pop:
     ```java
     st.pop(3); // Pops top 3 persons
     ```

4. **Display persons:**
   - Display all:
     ```java
     st.display();
     ```
   - Display top `n` persons:
     ```java
     st.display(2);
     ```

5. **Exit the program** by choosing option `7` in the menu.

## Technical Details
- **Programming Language:** Java
- **Project Structure:**
  ```
  ticket_counter/
  ├── Main.java       // Entry point with menu-driven interface
  ├── Person.java     // Person class with name, age, and gender
  └── Stack.java      // Stack class handling push, pop, and display
  ```
- **Key Concepts Used:**
  - Object-Oriented Programming (OOP) principles: classes, objects, method overloading.
  - Stack data structure with push/pop operations.
  - Enum usage for gender representation.
  - Input handling via `Scanner`.
  - Robust error handling for stack overflow, underflow, and invalid inputs.

## Notes
- The stack prevents overflow and underflow conditions.
- When displaying top `n` persons, the system adjusts if `n` exceeds current stack size.
- Can be extended to handle more person attributes or different data structures for more complex operations.
