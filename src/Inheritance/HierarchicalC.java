package Inheritance;

public class HierarchicalC extends HierarchicalP {
   public int multiplication() {
	   int g = 12;
	   int q = 7;
	   int t = g*q;
	   return t;
   }
	public static void main(String[] args) {
		HierarchicalC objct2 = new HierarchicalC();
		
		System.out.println(objct2.multiplication());
		
		HierarchicalP m5 = new HierarchicalP();
		
		m5.substraction(60,41);
		

	}

}
