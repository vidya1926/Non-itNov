package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LearnList {

	public static void main(String[] args) {

		List obj = new ArrayList();

		List obj1 = new LinkedList();

		// add elements into the list
		obj.add("Vidya");
		obj.add("emp12");
		obj.add(4);
		obj.add(12.3f);

		System.out.println(obj);

		obj1.add(1);
		obj1.add('R');
		System.out.println(obj1);

		List<Integer> num = new ArrayList<Integer>();

		num.add(10);// 0
		num.add(11);// 1
		num.add(20);// 2
		num.add(30);// 3
		num.add(30);
		// listname.get(index);-->to get the element from the particular index

		Integer integer = num.get(1);
		System.out.println(integer);

		// length of the list
		int size = num.size();
		System.out.println(size);

		System.out.println(num.get(num.size() - 1));

		for (int i = 2; i < size; i++) {
			Integer integer2 = num.get(i);
			System.out.println(integer2);
		}

		// to change any value in the particular index num.set(0,12);
		System.out.println(num);

		Collections.sort(num);
		System.out.println(num);

		Collections.reverse(num);
		System.out.println(num);

		// loop-->not based on index
		for (Integer listElements : num) {
			System.out.println(listElements);
		}

		boolean contains = num.contains(3);

		num.clear();
		System.out.println(num);

		num.remove(1);

		Set<Integer> values = new HashSet<Integer>();
		Set<Integer> values1 = new HashSet<Integer>();

		for (int i = 0; i < num.size(); i++) {
			boolean add = values.add(num.get(i));
			if (!add) {
				values1.add(num.get(i));
			}
		}

		System.out.println(values);
		System.out.println(values1);
		
		
		

	}

}
