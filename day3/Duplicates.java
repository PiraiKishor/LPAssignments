package week1.day3;

import java.util.Arrays;

public class Duplicates {

	public static void main(String[] args) {
		int[] marks = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length = marks.length;
		Arrays.sort(marks);
		for(int i=0;i<length-1;i++) {
			if(marks[i]==marks[i+1])
			{
				System.out.println("The duplicated values are" +" "+marks[i]);
			}
			
			
		}
		
		
	}

}
