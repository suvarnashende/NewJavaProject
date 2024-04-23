package Inheritance;

public class Multilevelnheritancec3 extends SingleInheritanceP {
	public void addition1(int l, int m) {
		int n = l + m;
		System.out.println(n);
	}

	public static void main(String[] args) {
		Multilevelnheritancec3 m3 = new Multilevelnheritancec3();

		m3.addition1(25, 25);

		SingleInheritanceP m4 = new SingleInheritanceP();

		System.out.println(m4.Addition());
	}

}
