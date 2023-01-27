package week3day2;

import java.util.HashSet;
import java.util.Set;

public class LearnDuplicates {

	public static void main(String[] args) {
		
		String name= "amazon";
		
		char[] charArray = name.toCharArray();
		//a,m,a,z,o,n
		
		Set<Character> unique=new HashSet<Character>();
		Set<Character>dupchar=new HashSet<Character>();

		for(int i=0;i<charArray.length;i++) {
			boolean add = unique.add(charArray[i]);
			if(!add) {
				dupchar.add(charArray[i]);
			}
		}
		
		
		System.out.println(unique);
		System.out.println(dupchar);
	}

}
