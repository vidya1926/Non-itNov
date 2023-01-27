package week1.day2;

import java.util.Arrays;

public class FindAvgMarks {

	public static void main(String[] args) {

		int[] marks= {75,35,67,90,100,56};
		
		int length = marks.length;
		int result=0;
		
		Arrays.sort(marks);
		
		for(int i=0;i<length;i++) {
			result=result+marks[i];//0+35-->result= 35+56
			
		}		
		System.out.println(result);		
		int avg=result/length;
		System.out.println(avg);
		
	}

}
