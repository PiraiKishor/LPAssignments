package week1.day3;

public class PrintReverse {

	public static void main(String[] args) {
		String name="LakshmiPriya";
		char[] charArray = name.toCharArray();
		System.out.println(charArray);
		int length=charArray.length;
		System.out.println(length);
		for(int i=length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
	}

}
