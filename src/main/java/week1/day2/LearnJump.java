package week1.day2;

public class LearnJump {

	public static void main(String[] args) {
				
		for(int i=0;i<5;i++) {
			
			if(i==2) {
				System.out.println("drink water" +i);
				break;//stop the execution of present loop
			}else {
				System.out.println(i);
			}
			
		}
				
		
		for(int i=0;i<10;i++) {
			if(i==4) {
				continue;//skip statement
			}
			System.out.println(i);
		}
		
		
	}

}
