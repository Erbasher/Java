package listsAdvaced;

import java.util.ArrayList;
import java.util.Scanner;

public class AdvancedList {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int rightNumber = 3;
		
		ArrayList<Integer> guesses = new ArrayList<Integer>();
		
		int guess = 0;
		
		do
		{
		
			System.out.println("Guess the right number between 1 - 5");
			System.out.println("If you want to exit, press 0");
			guess = Integer.parseInt(in.nextLine());
			
			// For a different way check AdvancedList2 
			
			if (guess == 0)
			{
				break;
			}
			
			guesses.add(guess);
			
			if (guess == rightNumber)
			{
				System.out.println("Great!\n");
			}
			
			
		
		} while (guess != rightNumber);
		
		System.out.println("Your guesses were:");
		for (int i = 0 ; i < guesses.size() ; i++)
		{
			System.out.println(guesses.get(i));
		}
		
		

	}

}
