package guessName;

import java.util.Scanner;

public class GuessName {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int guess = 0;
		String name;
		
		System.out.println("Guess my name (type stop to exit");
		
		do
			
			{
			
			name = in.nextLine();
			guess+=1;
		
			if (name.equals("Emma"))
			
			{
				System.out.println("Congratulations!");
				
				System.out.println("You guessed " + guess + " times.");
				
				break;
		
			}
		
			else if (name.equals("stop"))
			
			{
				System.out.println("You guessed " + (guess - 1) + " times");
				break;
			}
			
			else
				
			{
				System.out.println("Guess my name (type stop to exit");
			}
			
			}
		
			while (true);
		
	}
	
}
