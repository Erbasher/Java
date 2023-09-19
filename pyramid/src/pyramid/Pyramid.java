package pyramid;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 
		 System.out.println("How many rows?");
		 
		 int i, j, space;
		 int row = in.nextInt();
	      
	      	for (i = 0 ; i < row ; i++)
	      		
	      	{
	      		
	      		for (space = i + 1 ; space < row ; space++)            
	   	         
		        	 System.out.print(" ");	 
	        
	         	 for (j = 0 ; j <= i ; j++)
	        	 
	         		 System.out.print("*");
	         
	         	 System.out.print("\n");
	         
	      }

	}

}
