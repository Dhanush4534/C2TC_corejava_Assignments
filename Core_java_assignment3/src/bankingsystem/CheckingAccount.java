package bankingsystem;

public class CheckingAccount extends Account {
	public CheckingAccount(double initialBalance) {
		super(initialBalance);
		
	}
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("Deposit into Checking"+amount);
	}
	
	@Override
	public void withdraw(double amount) {
		if (amount <=balance) {
			balance-=amount;
			System.out.println("Withdrawl from checking:"+amount);
		}
		else {
			System.out.println("Insufficient balance in Checking account");
		}
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

}
