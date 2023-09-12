

package randomNumbers;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		System.out.println("*********\n");
		
	//	Print random numbers between 0 - 4	
		
		int randomNumber = random.nextInt(5);
		
		System.out.println("Random number between 0-4: \n" + randomNumber);
		
		System.out.println("*********\n");
		
	//  Print random numbers between 10 - 20	
		
		int randomNum = random.nextInt(11) + 10;
		
		System.out.println("Random number between 10-20: \n" + randomNum);
		
		System.out.println("*********\n");

	}

}
