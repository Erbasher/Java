package divisionCalc;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String num1, num2;
		double sum;
		
		System.out.println("Give a number: ");
		
		num1 = in.nextLine();
		
		System.out.println("Give me a second number: ");
		
		num2 = in.nextLine();
		
		sum = Integer.parseInt(num1) / Integer.parseInt(num2);
		
		System.out.println(sum);
		
	}

}
