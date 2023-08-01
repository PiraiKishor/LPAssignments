package week3.day1.w3d1homeassignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name="Lakshmi Priya";
		char[] charArray = name.toCharArray();
		Set<Character> uniqchar=new HashSet<Character>();
		Set<Character> repeatchar=new HashSet<Character>();
		for(int i=0;i<charArray.length;i++) {
			if(!uniqchar.add(charArray[i])) {
				repeatchar.add(charArray[i]);
			}
			
		}
		System.out.println(uniqchar);
		System.out.println(repeatchar);
	}

}

			
