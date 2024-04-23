package Inheritance;

public class SingleInheritanceC extends SingleInheritanceP {
    public int Substraction() {
    	int x = 40;
    	int y = 10;
    	int z = x-y;
    	return z;
    } 	
	public static void main(String[] args) {
		SingleInheritanceC object1 = new SingleInheritanceC();
		
		System.out.println(object1.Substraction());
		
		SingleInheritanceP object2 = new SingleInheritanceP();
             
            System.out.println(object2.Addition());
	}

}
