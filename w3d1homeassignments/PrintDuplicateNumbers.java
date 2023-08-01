package week3.day1.w3d1homeassignments;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		int length=data.length;
		System.out.println(length);
		for(int i=0;i<=data.length;i++) {
			
			for(int j=i+1;j<data.length;j++) {
				if(data[i]==data[j]) {
					System.out.print(data[j]);
					System.out.print(" ");
				}
			}
			
		}
	}

}
