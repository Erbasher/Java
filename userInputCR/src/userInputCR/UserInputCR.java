package userInputCR;

import java.util.Scanner;

public class UserInputCR {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String input;
		
		System.out.println("What is your name?");
		
		input = in.nextLine();
		
		if (input.equals(""))
			
		{
			System.out.println("Error");
		}
		
		else
		
		{
			System.out.println("Your name is " + input + ".");
		}

	}

}
