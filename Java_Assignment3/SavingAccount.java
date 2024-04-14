//6. Create a SavingsAccount class. Use a static data member annual Interest Rate
//to store the annual interest rate for each of the savers. Each member of the class
//contains a private data member
//savingsBalance indicating the amount the saver currently has on deposit. Provide
//member function calculateMonthlyInterest() that calculates the monthlyinterest
//by multiplying the balance by annualInterestRate
//divided by 12; this interest should be added to savingsBalance. Provide a static
//member functionmodifyInterestRate() that sets the static annualInterestRate to a
//new value. Write a driver program to
//test class SavingsAccount. Instantiate two different objects of
//classSavingsAccount, saver1 and saver2, with balances of
//2000.00 and 3000.00,respectively. Set the annualInterestRate to
//3 percent. Then calculate the monthlyinterest and print the new balances for
//each of the savers. Then set
//theannualInterestRate to 4 percent, calculate the next month&#39;s interest and print
//the new balances for each of the savers.

package javaassignment3;

public class SavingAccount {
	static double annualInterestRate;
	private double savingsBalance;
	private double interest;

	public SavingAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;

	}

	public SavingAccount() {

		savingsBalance = 0.0;

	}

	public void calculateMonthlyInterest() {
		interest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance = interest + savingsBalance;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingAccount.annualInterestRate = annualInterestRate / 100;
	}

	@Override
	public String toString() {
		return "SavingsAccount [savingsBalance=" + savingsBalance + ", interest=" + interest + "]";
	}

	public static void main(String[] args) {
		SavingAccount saver1 = new SavingAccount(20000);
		saver1.setAnnualInterestRate(3);
		saver1.calculateMonthlyInterest();
		System.out.println(saver1);
		SavingAccount saver2 = new SavingAccount(30000);
		saver2.setAnnualInterestRate(4);
		saver2.calculateMonthlyInterest();
		System.out.println(saver2);

	}

}
