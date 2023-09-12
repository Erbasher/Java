package array;

public class Arrays {

	public static void main(String[] args) {
		
		// Variable
		
		int temperature;
		int sum = 0;
		int avg = 0;
		
		temperature = 15;
		
		// Array
		
		int[] temperatures;
		
		temperatures = new int[7];
		
		temperatures[0] = 15;
		temperatures[1] = 18;
		temperatures[2] = 9;
		temperatures[3] = 10;
		temperatures[4] = 25;
		temperatures[5] = 26;
		temperatures[6] = 27;
		
		// Print the information of the 3rd cell (index 2)
		
	//	System.out.println(temperatures[2]);
		
		// Print the whole array with for loop
		
		for (int i = 0; i < temperatures.length ; i++)
		{
			System.out.println(temperatures[i]);
			sum = sum + temperatures[i];
		}
		
		System.out.println("Total: " + sum);
		
		avg = sum / temperatures.length;
		
		System.out.println("Average: " + avg);
		
		// Many prog languages has already made methods fot average or sum
		// System.out.println(temperatures.avg());
		// System.out.println(temperatures.sum());
		
		
	}

}
