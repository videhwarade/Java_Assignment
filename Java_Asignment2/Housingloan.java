package metassignment;

public class Housingloan extends LoanAccount {
	int tenure;

	public Housingloan(String accNo, double loanAmt, int tenure) {
		super(accNo, loanAmt);
		this.tenure = tenure;
	}

	public void extendTenure(int yr) {
		tenure = tenure + yr;
		System.out.println("Tenure extended successfully");
	}

}
