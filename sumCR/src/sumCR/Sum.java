package sumCR;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String num1;
		String num2;
		int sum = 0;
		
		System.out.println("First number? ");
		
		num1 = in.nextLine();
		
		System.out.println("Second number? ");
		
		num2 = in.nextLine();
		
		sum = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		System.out.println("The sum is " + sum + ".");
		
	}

}
