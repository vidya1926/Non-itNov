package week1.day2;

public class LearnArray {

	public static void main(String[] args) {
		
	//	int marks=75,35,67,90,100;
		//Array ->collection of data with similar datatype-->contiguous memory
		//0,1,2,3,4,5
		//use index-->starts with zero ends with n-1(lastindex)
		//it of fixed size
		//declaration type 1
		int[] marks= {75,35,67,90,100};
		
		//datatype[] arrayname={value};
		
		String[] words= {"java","Selenium","python"};
		
		
		//declaration type:2
		int[] numbers=new int[5];
		numbers[0]=1;
		numbers[1]=2;
		numbers[2]=3;
		numbers[3]=4;
		numbers[4]=5;  
	//	numbers[5]=6;
		
		System.out.println(numbers[4]);
		

	}

}
