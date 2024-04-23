package SimpleJavaProgram;

import java.util.Scanner;

public class LeapYearScanner {

	public static void main(String[] args) {
		int year;
		System.out.println("enter the leap year:: ");
		Scanner sc = new Scanner (System.in);
		year = sc.nextInt();
	if(year % 4 ==0) {
		System.out.println(" Specified year is a leap year");
		
	}else {
		System.out.println(" Specified year is not a leap year");
	}

	}

}
