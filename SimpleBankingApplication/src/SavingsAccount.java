/*
 * Written by M.M.Clark
 */
public class SavingsAccount extends SimpleBankingApplication {

	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void deposit(double amount) {
		setBalance(getBalance()+amount);
		System.out.println("Deposit of $"+amount+" successful. Current balance: $"+
		getBalance());
	}

	@Override
	public void withdraw(double amount) {
		if(getBalance() >= amount)
		{
			setBalance(getBalance() - amount);
			System.out.println("Withdrawl of $"+amount+" successful. Current balance: $"+
			getBalance());
		}
		else
		{
			System.out.println("Insufficient funds. Withdrawal failed.");
		}
	}
}
