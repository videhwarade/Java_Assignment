//Create a class, named Account and include the required attributes and
//behaviours in it. Inherit another class called “SavingsAccount” from it
//and add new attributes and behaviours, as needed. Inherit another class
//called “LoanAccount” from Account and add new attributes and
//behaviours, as needed. Inherit another class called “HousingLoan” from
//LoanAccount and add new attributes and behaviours, as needed. Create
//objects of SavingsAccount and HousingLoan and perform the methods to
//1. Open an account, 2. Deposit amount, 3. Withdraw amount, 4. Print
//the account details. (Consider applying the Access Modifiers also)

package metassignment;

public class Account {

	String accNo;
	double bal;

	public Account(String accNo) {
		this.accNo = accNo;
		bal = 0;
	}

	public void openAccount() {
		System.out.println("Open Account");
	}

	public void deposite(double amt) {
		bal = bal + amt;
	}

	public void withdraw(double amt) {
		if (bal > amt) {
			bal = bal - amt;
		} else {
			System.out.println("Insuffiecient balance");
		}
	}

	public void printAccountDetails() {
		System.out.println("Account No" + accNo);
		System.out.println("Balance " + bal);
	}
}
