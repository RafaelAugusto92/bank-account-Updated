package entities;

public class BankAccountTwo {

	private double balance;
	private String holder;
	private int accountNumber;
	
	public BankAccountTwo(String holder, int accountNumber) {
		this.holder = holder;
		this.accountNumber = accountNumber;
	}

	public BankAccountTwo(double initialValue, String holder, int accountNumber) {
		deposit(initialValue);
		this.holder = holder;
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		this.balance -= value;
	}

	
	public String show() {
		return
				"Your balance is: "
				+ getBalance() + "\n"
				+ "Your account name is: "
				+ getHolder() + "\n"
				+ "Your account Number is: "
				+ getAccountNumber();
	}
	
}
