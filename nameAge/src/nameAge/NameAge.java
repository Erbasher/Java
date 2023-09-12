package nameAge;

import java.util.Scanner;

public class NameAge {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String name = "";
		String age = "";
		
		System.out.println("What is your name?");
		
		name = in.nextLine();
		
		System.out.println("How old are you?");
		
		age = in.nextLine();
		
		System.out.println("Your name is " + name + " and you are " + age + " years old.");

	}

}
