package ExceptionHandling;

public class AgeLimit {
	int agelimit = 18;

	
	public void applyage(int age) {
		if (age < 18) {
			
			throw new DrivingLicense("invalid age");
		}
		
	}

	public static void main(String[] args) {
		AgeLimit agelimit = new AgeLimit();
		System.out.println("valid age for driving license is = " + agelimit.agelimit);
		agelimit.applyage(14);
		

	}
}
