package week1.day1;

public class Calculator {
	
	
	//add and sub
	
	public int add(int a,int b) {
		//int c=a+b;
		//return c;
		return a+b;
	}
	
	public double mul(double e,double d) {			
		return e*d;
	}
	
	public int div(int x,int y) {
		//System.out.println(x/y);
		return x/y;
	}
		
		
	public static void main(String[] args) {
		Calculator fun=new Calculator();
		 int add = fun.add(20,30);
	
		 System.out.println(add);
		 
		 System.out.println(fun.mul(2.5, 3.70));
	}

}
