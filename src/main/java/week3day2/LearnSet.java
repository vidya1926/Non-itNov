package week3day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		
		Set<Integer> values= new HashSet<Integer>();
		
		values.add(1);
		values.add(4);
		values.add(1);
		values.add(5);
		
		
		System.out.println(values);
		
		for (Integer integer : values) {
			System.out.println(integer);
		}
		
		
		List<Integer> n=new ArrayList<Integer>(values);
		Integer integer = n.get(1);
		
		
	}

}
