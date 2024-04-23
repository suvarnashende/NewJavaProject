package Inheritance;

public class MultilevelnheritanceC2 extends MultileveInheritanceC1 {
   public void Multiplication( int h, int i) {
	   int j = h*i;
	   System.out.println(j);
   }
	public static void main(String[] args) {
		MultilevelnheritanceC2 method = new MultilevelnheritanceC2();
		method.Multiplication(7, 4);
		MultileveInheritanceC1 method1 = new MultileveInheritanceC1();
		method1.Division(10, 2);
		
		
	}

}
