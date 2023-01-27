package week1.day2;

public class LearnAccessSpecifier {
	
	
	public void commonArea(){
		System.out.println("Can anyone enter the area");
	}
	
	private void doorkeys() {
		System.out.println("Can have access by the owner"); 
		
	}
	
	 void carParking() {
		 System.out.println("Can be accessed by the people inside the apartment");
	 }
	
	protected void debitCard() {
		System.out.println("giving access to by husband");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnAccessSpecifier access=new LearnAccessSpecifier();
		access.carParking();
		access.commonArea();
		access.doorkeys();
		access.debitCard();
		
		
	}

}
