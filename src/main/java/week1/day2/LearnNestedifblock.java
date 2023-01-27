package week1.day2;

public class LearnNestedifblock {

	public static void main(String[] args) {

		int input=15;
		
		//15/3-->print divisible 
		//15/2-->not divisible
		//15/15-->true-->divisible
		//should be true /anyone is true
		if(input%2==0 && input%15==0) {
			//to find the number is divisible -->chk remainder==0
			System.out.println("divisible by both");
		}
		else if(input%2==0 || input%5==0)
		{
		System.out.println("it is divisible as one condition is true ");
		}
		else {
			System.out.println("Cannot divide");
		}
		
	}

}
