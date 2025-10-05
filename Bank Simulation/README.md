# Simple Banking Simulation

## Project Overview

This project is a command-line banking simulation built with Java. It demonstrates basic banking functionalities like depositing, withdrawing, and checking balances. The primary focus is on robust exception handling, showcasing the use of both built-in and custom exceptions to manage invalid user inputs and transactional errors gracefully.

---

## Main Features

* **Account Operations**: Perform essential banking tasks:
    * 💵 **Deposit**: Add funds to your account.
    * 💳 **Withdraw**: Withdraw money, with checks for sufficient balance.
    * 📊 **Check Balance**: View the current account balance.
* **Menu-Driven Interface**: A simple and interactive command-line menu for easy navigation.
* **Robust Exception Handling**: Manages various error scenarios to prevent application crashes:
    * Handles non-numeric inputs.
    * Prevents withdrawals of negative amounts.
    * Blocks withdrawals that exceed the available balance using a custom exception.

---

## Usage

1.  **Compile the Code**: Open your terminal or command prompt, navigate to the project's source directory, and compile the Java files using the Java compiler.
    ```bash
    javac *.java
    ```
2.  **Run the Application**: Execute the main class to start the simulation.
    ```bash
    java BankDemo
    ```
3.  **Interact**: Follow the on-screen menu prompts to select an option (deposit, withdraw, check balance, or exit).

---

## Exception Handling Implemented

This project is designed to handle the following specific exceptions:

* `InputMismatchException`: A **built-in exception** that is caught when the user enters text instead of a numeric value for menu choices or transaction amounts.
* `ArithmeticException`: A **built-in exception** used here to handle attempts to withdraw a negative or zero amount.
* `InsufficientBalanceException`: A **custom exception** that is thrown when a user tries to withdraw an amount greater than their current account balance.
