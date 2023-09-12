package looppeja;

import java.util.Random;
import java.util.Scanner;

public class Looppeja {

	public static void main(String[] args) {
		
		// Practicing for-loops with Java
		
		// Write "Hey" for 5 times
		
		// for (lähtönumero ; ehto ; laskuria kasvatetaan joka kierroksella yhdellä
		
		
//		for (int i = 0 ; i < 5 ; i++)
//		
//		{
//		
//		System.out.println("Hey!");
//		
//		}
		
		// While-loops
		
		// Print numbers from 1 to 5
		
//		int i = 0;
//		
//		while (i < 5)
//		{
//			System.out.println(i + 1);
//			i++;
//		}
		
		// DO  WHILE -loop
		
//		Random r = new Random();
//		Scanner in = new Scanner(System.in);
//		
//		String playAgain;
//		
//		do
//		{
//			System.out.println("Throwing the dice");
//			System.out.println(r.nextInt(7) + 1);
//			
//			System.out.println("Play again (y/n)?");
//			playAgain = in.nextLine();
//			
//		} while (playAgain.equals("y"));
//			// Play again == y won't work
//		
//		System.out.println("Thanks for playing!");
		
		// FOR loop 'break'
		
		for (int i = 0 ; i < 100 ; i++)
			
		{
			System.out.println(i);
			if (i == 10)
			{
				break;
			}
		}
		

	}

}
