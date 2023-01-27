package week1.day2;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {

		int[] marks= {75,35,67,90,100,56};
		
		//to find the length of the array-->print number of elements
		
		int length = marks.length;
		System.out.println(length);
		
		//to print an array-->for loop
		for(int i=0;i<length;i++) {
		
		System.out.println(marks[i]);
		//marks[0]
		//marks[1]
		}
		
		Arrays.sort(marks);//ascending order
		
		for(int i=0;i<length;i++) {			
			System.out.println(marks[i]);
			
			}
		
		//min value-->arr[0]-->marks[0]-->35
		//max vaue-->arr[length-1]-->marks[5]-->100
		
		
		for(int i=length-1;i>=0;i--) {			
			System.out.println(marks[i]);
			
			}
		
		
	}

}
