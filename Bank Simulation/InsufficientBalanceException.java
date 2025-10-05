package bankdemo;

public class InsufficientBalanceException extends Exception {

	void InsufficientFundsException() {
        System.out.println("Your account have Insufficient amount to withdraw.");
    }
}
