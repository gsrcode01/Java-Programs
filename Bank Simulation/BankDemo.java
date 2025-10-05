package bankdemo;

import java.util.InputMismatchException;
import java.util.*;

public class BankDemo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double accountNo;
	System.out.println("Enter Account Number:");
	accountNo = sc.nextDouble();
	while (true) {
        try {
            accountNo = sc.nextDouble();
            break;
        } catch (InputMismatchException e) {
            System.out.print("Invalid input. Please enter a valid account number: ");
            sc.next();
        }
    }
    sc.nextLine(); 

    System.out.print("Enter account holder name: ");
    String name = sc.nextLine();

    double initialBalance = 0;
    System.out.print("Enter initial balance: ");
    while (true) {
        try {
            initialBalance = sc.nextDouble();
            if (initialBalance < 0) {
                System.out.print("Initial balance cannot be negative. Please enter again: ");
                continue;
            }
            break;
        } catch (InputMismatchException e) {
            System.out.print("Invalid input. Please enter a valid amount: ");
            sc.next();
        }
    }

    AccountClass account = new AccountClass(accountNo, name, initialBalance);

    int choice = 0;
    do {
        System.out.println("\n--- Bank Menu ---");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Show Account Detail");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        try {
            choice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number between 1 and 4.");
            sc.next();
            continue;
        }

        switch (choice) {
            case 1:
                System.out.print("Enter deposit amount: ");
                try {
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Deposit amount must be a number.");
                    sc.next();
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 2:
                System.out.print("Enter withdrawal amount: ");
                try {
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Withdrawal amount must be a number.");
                    sc.next();
                } catch (ArithmeticException | InsufficientBalanceException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 3:
                account.displayAccountDetails();
                break;

            case 4:
                System.out.println("Thank you for banking with us. Goodbye!");
                break;

            default:
                System.out.println("Invalid choice! Please select between 1 and 4.");
                break;
        }

    } while (choice != 4);
}
}
