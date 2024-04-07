package metassignment;

public class LoanAccount extends Account {
	double loanAmt;

	public LoanAccount(String accNo, double loanAmt) {
		super(accNo);
		this.loanAmt = loanAmt;
	}

	public void payEMI(double emi) {
		if (bal > emi) {
			System.out.println("EMI paid successfully");
			loanAmt = loanAmt - emi;
		} else {
			System.out.println("Insufficient balance");
		}
	}
}
