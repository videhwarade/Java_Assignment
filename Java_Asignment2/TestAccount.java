package metassignment;

public class TestAccount {

	public static void main(String[] args) {
		savingAccount sa = new savingAccount("100324", 1.5);
		sa.printAccountDetails();

		sa.deposite(10000);

		sa.addInterset();
		sa.printAccountDetails();

		System.out.println("========================================");
		Housingloan hl = new Housingloan("342651596", 15000, 15);
		hl.payEMI(2500);
		hl.extendTenure(6);

	}

}
