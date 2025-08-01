package bankingsystem;

final class Transaction {
	private final double transactionfee=2.5;
	public final void performTransaction(Account account,double amount,boolean isDeposit) {
		if(isDeposit) {
			account.deposit(amount);
			
		}
		else {
			account.withdraw(amount+transactionfee);
			
		}
		System.out.println("Transaction fee applied:"+transactionfee);
		
	}

}
