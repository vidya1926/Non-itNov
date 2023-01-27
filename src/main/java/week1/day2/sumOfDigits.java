package week1.day2;

public class sumOfDigits {

	public static void main(String[] args) {

		int input=345; //3+4+5=12
		int rem;
		int sum=0;
		while(input>0) {
			rem=input%10;  //5
			
			sum=sum+rem;
			//sum=0+5;
			
			input=input/10;		
			
			/*
			 * 345/10-->5 
			 * 34/10-->4
			 *  3
			 */
			
			
		}
		
		
		System.out.println(sum);
		
		
	}

}
