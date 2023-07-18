package week1.day2;

public class Tab {

	public static void main(String[] args) {
		Mobile phn1=new Mobile();
		phn1.sendSms();
		phn1.makeCall(9685452411l);
		System.out.println(phn1.makeCall(9685452411l));
	}

}
