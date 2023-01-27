package week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CountofElementsinList {

	public static void main(String[] args) {

		int[] num = { 1, 3, 4, 5, 4, 6, 4, 2 };

		List<Integer> n = new LinkedList<Integer>();

		System.out.println(n);

		for (int i = 0; i < num.length; i++) {
			n.add(num[i]);
		}

		int frequency = Collections.frequency(n, 4);
		System.out.println(frequency);

		String[] name = { "vidya", "Catherine", "Mirudula", "Anees", "vidya" };

		List<String> n1 = new ArrayList<String>(Arrays.asList(name));
		System.out.println(n1);

		int count = Collections.frequency(n1, "vidya");

		System.out.println(count);
		
		
		
		
		
	}

}
