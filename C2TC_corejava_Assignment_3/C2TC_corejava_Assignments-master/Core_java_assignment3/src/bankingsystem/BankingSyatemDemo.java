package bankingsystem;

public class BankingSyatemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1 = new Bank();
        Bank b2 = new Bank();
        System.out.println("Total accounts created: " + Bank.getTotalAccounts());

        // Abstract demo with subclasses
        Account savings = new SavingAccount(1000);
        Account checking = new CheckingAccount(2000);

        savings.printAccountType();
        checking.printAccountType();

        // Final class and method demo
        Transaction txn = new Transaction();
        txn.performTransaction(savings, 200, true);   // Deposit
        txn.performTransaction(checking, 500, false); // Withdraw

        // Final result
        System.out.println("Final Savings Balance: " + savings.getBalance());
        System.out.println("Final Checking Balance: " + checking.getBalance());

	}

}
