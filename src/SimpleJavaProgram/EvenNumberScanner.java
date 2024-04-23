package SimpleJavaProgram;

import java.util.Scanner;

public class EvenNumberScanner {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		if(number % 2 ==0) {
			System.out.println("this is even number ");
		}else {
			System.out.println("this is odd number");
		}

	}

}
