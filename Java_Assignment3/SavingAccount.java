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
