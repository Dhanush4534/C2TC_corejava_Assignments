package bankingsystem;

public abstract class Account {
	protected  double balance; 
	public Account(double initialbalance) {
		this.balance=initialbalance;
		Bank bank=new Bank();
	}

	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract double getBalance(); 
	
	public void printAccountType() {
		System.out.println("This is Bank Account");
		
	}
	
}

