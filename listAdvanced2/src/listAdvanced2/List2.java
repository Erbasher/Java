package listAdvanced2;

import java.util.ArrayList;
import java.util.Scanner;

public class List2 {

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
			
			guesses.add(guess);
			
			if (guess == rightNumber)
			{
				System.out.println("Great!\n");
			}
			
			if (guess == 0)
			{
				break;
			}
			
		} while (guess != rightNumber);
		
		guesses.remove(guesses.size() - 1);
		
		System.out.println("Your guesses were:\n");
		for (int i = 0 ; i < guesses.size() ; i++)
		{
			System.out.println(guesses.get(i));
		}
		
		

	}

	}

