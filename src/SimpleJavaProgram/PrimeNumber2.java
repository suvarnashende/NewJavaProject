package SimpleJavaProgram;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int number = 2;
		int temp = 0;
		for(int i = 2; i<=number-1;i++) {
			if(number % i == 0) {
				temp=temp+1;
			}
		}if(temp==0) {
			System.out.println(number + " is not a prime number");
			
		}else {
			System.out.println(number + " is a prime number");
		}
		

	}

}
