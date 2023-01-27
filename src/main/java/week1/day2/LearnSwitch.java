package week1.day2;

public class LearnSwitch {

	public static void main(String[] args) {

		//switch(expression){
		//case value:
		//{logic with break}}
		
		String month="April";
		
		switch(month) {
		
		case "January":{
			System.out.println("The given month is jan");
			break;
		}
		
		case "Feburary":
		{
			System.out.println("the given month is feb");
			break;
		}
		
		case "December":
		{
			System.out.println("The given Month is dec");
			break;
		}
		
		case "March":
		{
			System.out.println("The given month is march");
			break;
		}
		
		default:
			System.out.println("the month is june");
		}
		
		
		
		
	}

}
