package week1.day3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();
		
		int length = charArray.length;
		for(int i=0;i<=length-1;i++) {
			if(i%2!=0) {
			 char c = charArray[i];
			System.out.println(c);
			
				
			}
			
		}
		
		

	}

}
