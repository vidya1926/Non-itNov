package week3day2;

public class LearnStatic {

	public static int x=10;//constant
	
	public static void m1() {
		System.out.println("I am from Static");
	}
	
	
	public static void main(String[] args) {
		int n=15
				,count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("non-prime");
		}
		else
		{
			System.out.println("prime");
		}		
	}

}
