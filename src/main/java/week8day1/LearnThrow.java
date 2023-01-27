package week8day1;

public class LearnThrow {
	
	public static void m1(int num1,int num2) {
		
		if(num1>num2) {
			int n=num1-num2;
		}else {
			throw new ArithmeticException("Invalid input");
		}
	}
	
	public static void main(String[] args)  {
		m1(12,5);
	}

}
