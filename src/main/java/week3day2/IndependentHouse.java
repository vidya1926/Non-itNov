package week3day2;

public class IndependentHouse implements LearnInterface,GetLoan {

	
	@Override
	public void buyLand() {
			System.out.println("Bought to build Independent house");
	}

	
		
	public void myOwnDesign() {
		System.out.println("My design");
	}



	@Override
	public void partialInfastructure() {
		
		
	}

	public void homeLoan() {
		System.out.println("Loan approved with 30lak with interest");
		
		
	}

}
