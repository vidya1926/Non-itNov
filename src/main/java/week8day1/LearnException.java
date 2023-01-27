package week8day1;

public class LearnException {

	public static void main(String[] args) {

		String name="vidya";
		String name1=name.concat("r");
		int x=10;
		int y=0;
		int[] arr= {1,2,3,4};
		try {
			System.out.println(arr[4]);
			
		} /*catch (ArithmeticException e) {
			System.out.println("The logic of the divison is wrong");
		}catch(ArrayIndexOutOfBoundsException a) {
			
			System.out.println(arr[3]);
			
		}catch(Exception ex) {
			System.out.println("Unknown Exception");
		}*/
		finally {		
		System.out.println("taskkill");
		}
		
		System.out.println("Learning to handle Exception");
	}

}
