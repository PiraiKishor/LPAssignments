package week1.day2;

public class Mobile {
	
	public void sendSms()
	{
		System.out.println("From Oppo");
	}
	public long makeCall(long phno) {
		return phno;
	}

	public static void main(String[] args) {
		Mobile myPhone=new Mobile();
		myPhone.sendSms();
		long makeCall = myPhone.makeCall(9988774459l);
		System.out.println(makeCall);
		
	}

}
