package toys;

import java.util.Scanner;


public class primenumbers {
	
	   public static boolean Prime(int p) {
	       if ( p == 2){
	    	   return true;
	       }
	       else if ( p == 3){
	    	   return true;
	       }
	       else if ( p == 5){
	    	   return true;
	       }
	       else if ( p == 7){
	    	   return true;
	       }
	       else if( (p % 2 == 0) || p % 3 == 0 || p % 5 == 0 || p % 7 == 0){
	    	   return false;
	       }
	       return true;
	   }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("input your number:");
		 int x = s.nextInt();
		System.out.print(Prime(x));
		       
}
}