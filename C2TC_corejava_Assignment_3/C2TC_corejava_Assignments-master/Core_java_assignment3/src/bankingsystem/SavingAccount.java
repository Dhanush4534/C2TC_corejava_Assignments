package bankingsystem;

public class SavingAccount extends Account {
	public SavingAccount(double initialBalance) {
		super(initialBalance);
		
	}
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
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
