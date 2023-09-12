package countSquare;

public class CountSqare {

	public static void main(String[] args) {
		
		
		countSquare(6, 2);
		
	}
	
	public static void countSquare(int length, int width)
		
	{
		int square;
		
		System.out.println(length);
		System.out.println(width);
		
		square = length * width;
		
		System.out.println("Square is: " + square);
		
	}
}
