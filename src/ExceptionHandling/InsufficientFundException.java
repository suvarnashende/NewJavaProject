package ExceptionHandling;

public class InsufficientFundException extends RuntimeException {
   private String message;
	
		public InsufficientFundException(String message) {
		       super (message);

	}
}

