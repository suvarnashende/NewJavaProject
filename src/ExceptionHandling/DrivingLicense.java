package ExceptionHandling;

public class DrivingLicense extends RuntimeException{
     private String message;
	public DrivingLicense(String message) {
		super (message);
	}

	}
