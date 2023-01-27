package week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
		String[] list = { "Adam", "Ben", "Zara", "Adam", "Charlie", "James", "Ben", "Adam" };

		List<String> values = new ArrayList<String>(Arrays.asList(list));
		System.out.println("Count of Adam is " + Collections.frequency(values, "Adam"));
		List<String> dupValues = new ArrayList<String>();
		int size = values.size();
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size-1;j++) {
				if(values.get(i)==values.get(j)){
					dupValues.add(values.get(i));
				}
							}
		}
		System.out.println(dupValues);
		values.removeAll(dupValues);
		System.out.println(values);
		

	}

}
