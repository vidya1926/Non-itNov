package week8day1;

public class Learnthrows {

	
	public static void m1()  {
		for(int i=0;i<=5;i++) {
			
		}
			try {
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
        System.out.println(e);			}
		}
	
	
	
	public static void main(String[] args) {
		
		m1();
	}

}
