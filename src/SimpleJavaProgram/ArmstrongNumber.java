package SimpleJavaProgram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int c = 0, a, temp;
		int n = 153;
		temp = n;
		while (n > 0) {

			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);

		}
		if (temp == 0) {
			System.out.println(temp + " is Armstrong number");
		} else {
			System.out.println(temp + " is not an Armstrong number");
		}

	}

}
