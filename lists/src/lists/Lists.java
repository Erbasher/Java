package lists;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Mike");
		names.add("Pia");
		names.add("Jaana");
		names.add("Pekka");
		
	//	System.out.println(names.get(1));
		
		names.remove(0);
		
		for (int i = 0 ; i < names.size() ; i++)
		{
			System.out.println(names.get(i));
		}

	}

}
