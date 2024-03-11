/*
 * Written by M.M.Clark
 */
public class Main {

	public static void main(String[] args) {
		double ibal, damt, wamt;
		ibal = 1000.00;
		SavingsAccount savingsAccount = new SavingsAccount("SA001", ibal);
		System.out.println("Savings A/c: Initial Balance: $"+ibal);
		damt = 500.00;
		savingsAccount.deposit(damt);
		wamt = 250.00;
		savingsAccount.withdraw(wamt);
		wamt = 1600.00;
		System.out.println("\nTry to withdraw: $"+wamt);
		savingsAccount.withdraw(wamt);
		
		System.out.println();
		ibal = 5000.00;
		CheckingAccount checkingAccount = new CheckingAccount("CA001", ibal);
		System.out.println("Current A/c: Initial Balance: $"+ibal);
		damt = 2500.00;
		checkingAccount.deposit(1000.0);
		wamt = 1250.00;
		checkingAccount.withdraw(3000.0);
		wamt = 6000.00;
		System.out.println("\nTry to withdraw: $"+wamt);
		savingsAccount.withdraw(wamt);
	}

}
