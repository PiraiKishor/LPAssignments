package week3.day1.w3d1homeassignments;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] company = { "Google", "Microsoft", "TestLeaf", "Maverick" };
		int length = company.length;
		System.out.println(length);
		List<String> arrayList = new ArrayList<String>();
		Collections.addAll(arrayList, company);
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		Collections.sort(arrayList, Collections.reverseOrder());
		System.out.println(arrayList);
	}

}
