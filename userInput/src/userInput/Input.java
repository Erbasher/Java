package userInput;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

	// User input String
		
		Scanner in = new Scanner(System.in);
		
		String answer = "";
		
		int noun = 0;
		
		System.out.println("Please write something: \n");
		
		answer = in.nextLine();
		
		System.out.println("\n You wrote: " + answer + "\n");
		
		System.out.println("*******************\n");
		
	//  User input number
		
		System.out.println("Write a number so i multiply it with 2: \n");
		
		answer = in.nextLine();
		
		noun = Integer.parseInt(answer);
		
		noun = noun * 2;
		
		System.out.println("\n You wrote: " + noun + "\n");
		
		System.out.println("*******************\n");

	}

}
