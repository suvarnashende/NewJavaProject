package Inheritance;

public class MultileveInheritanceC1 extends SingleInheritanceC {
  public void Division(int e, int f){
	  int g = e/f;
	  System.out.println(g);
  }
	public static void main(String[] args) {
		MultileveInheritanceC1 m1 = new MultileveInheritanceC1();
		m1.Division(10, 2);
		SingleInheritanceC m2 = new SingleInheritanceC();
		System.out.println(m2.Substraction());
	}

}
