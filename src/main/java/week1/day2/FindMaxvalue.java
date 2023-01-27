package week1.day2;

import java.util.Arrays;

public class FindMaxvalue {

	public static void main(String[] args) {
		int[] nums = {22, 3981, -19, 82, 0, 45, 37};
		
		
		Arrays.sort(nums);
		
		int len=nums.length;
		
		System.out.println(nums[len-2]);
		int min=nums[0];//-19 0
		int max=nums[0];//-19
		
		
		for(int i=0;i<len;i++) {
			
			if(nums[i]<min) {
				min=nums[i];
			}
			
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		
		
		
		System.out.println(min);
		System.out.println(max);
		
		
		
	}

}
