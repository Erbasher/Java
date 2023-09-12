package inputHarjoitus;

import java.util.Scanner;

public class InputHarjoitus {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		String num1;
		String num2;
		String answer;
		int sum = 0;
		
		System.out.println("Give a number: ");
		
		num1 = in.nextLine();
		
		System.out.println("Give another number: ");
		
		num2 = in.nextLine();
		
		System.out.println("Do you want to add or subtract? Type 'add' or 'sub'");
		
		answer = in.nextLine();
		
		String add = "add";
		String sub = "sub";
			
		if (answer.equals("add"))
		
		{
			sum = Integer.parseInt(num1) + Integer.parseInt(num2);
		}
			
		else if (answer.equals("sub"))
				
		{
			sum = Integer.parseInt(num1) - Integer.parseInt(num2);
		}
		
		else if (sum > 10)
		{
			System.out.println("Tulos on yli 10. Tulos on: " + sum);
		}
		
		else
		
		System.out.println(sum);
		
		
		
		

	}

}
