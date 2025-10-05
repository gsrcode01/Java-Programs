package bankdemo;

public class AccountClass {
	private double accountNo;
	private String name;
	private double accountBalance;
	
	AccountClass( double AN, String name,double AB){
		this.accountBalance = AN;
		this.name = name;
		this.accountBalance = AB;
	}
	public void deposit(double amount) throws ArithmeticException {
		if(amount<0) {
			throw new  ArithmeticException("you cannot deposit negative amount. Again enter the amount  ");
		}else {
			System.out.println("Deposited amount:"+amount);
			accountBalance += amount;
		}
	}
	public void withdraw(double amount) throws InsufficientBalanceException, ArithmeticException {
		if(amount < 0) {
			throw new  ArithmeticException("you cannot Withdraw negative amount. Again enter the amount  ");
		}
		if(amount > accountBalance ) {
			throw new InsufficientBalanceException();
		}
		accountBalance -= amount;
		System.out.println("Withdrawed Amount:"+amount);
	}
	
	public void displayAccountDetails() {
		System.out.println("Account Number:"+this.accountNo);
		System.out.println("Account holder name:"+this.name);
		System.out.println("Account Balance:"+this.accountBalance);
	}
	
}
