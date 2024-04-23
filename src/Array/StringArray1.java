package Array;

public class StringArray1 {
   //iteration with enhanced for loop
	public static void main(String[] args) {
		String car[] = new String[5];
       car[0] = "Mercedes";
       car[1] = "kia";
       car[2] = "Hyundai";
       car[3] = "Tata";
       car[4] = "Mahindra";
	
       for(String a : car) { 
    	   System.out.println(a);
    	   }
       }

}
