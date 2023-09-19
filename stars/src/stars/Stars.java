package stars;

import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {
			
		
		int row, i, j;
		
		
	      Scanner in = new Scanner(System.in);
	      
	      System.out.println("How many rows?");
	      
	      row = in.nextInt();
	      
	      for(i=0; i<row; i++)
	    	  
	      {
	    	  
	         for(j=0; j<=i; j++)
	        	 
	            System.out.print("*");
	         
	         System.out.print("\n");
	         
	      
	      }
		
	}

}
