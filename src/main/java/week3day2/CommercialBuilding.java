package week3day2;

public class CommercialBuilding extends Flat implements LearnInterface, GetLoan {

	public void buyLand() {
		System.out.println("Bought for commercial purpose");

	}

	public void threeBhk(int num) {
		String name="vidya";
		System.out.println("built with 3 bhk bought by me");
	}
	//overriding -->same method, same argument, in different class
	
	public void homeLoan() {
		System.out.println("Loan approved with 70lakhs");

	}

	@Override
	public void partialInfastructure() {
		System.out.println("Partially built");
	}

	@Override
	public void modularKitchen() {
		System.out.println("Implemented Modular design");
	}

	public static void main(String[] args) {
		CommercialBuilding multipurpose = new CommercialBuilding();
		multipurpose.buyLand();
		multipurpose.partialInfastructure();
		multipurpose.homeLoan();
		multipurpose.modularKitchen();
		multipurpose.threeBhk(3);

		IndependentHouse ih = new IndependentHouse();
		ih.buyLand();
		ih.myOwnDesign();
		ih.homeLoan();
		System.out.println("Final Variable " + ih.roi);
		int roi2 = ih.roi;
		int x = roi2 - 2;

		System.out.println("Manipulated to Local variable " + x);

	}

}
