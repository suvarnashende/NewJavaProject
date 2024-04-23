package SimpleJavaProgram;

public class ArmstrongNumber1 {

	public static void main(String[] args) {
		int a =153 ,x,temp;
		int num = 153;
		temp = num;
		
		while(num>0) {
			x = num % 10;//15
			num = num/10;//5
			a = a+(x*x*x); //1
		}
if (temp !=0) {
	System.out.println(+num + "is a armstrong number");
}else {
	System.out.println(num + " is not a armstrong number");
}
	}

}
