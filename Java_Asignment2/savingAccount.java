package metassignment;

public class savingAccount extends Account {
	private double interestRate;

	public savingAccount(String accNo, double interestRate) {
		super(accNo);
		this.interestRate = interestRate;
	}

	public double addInterset() {
		double interest = bal * interestRate;
		bal = bal + interest;
		return interest;

	}
}