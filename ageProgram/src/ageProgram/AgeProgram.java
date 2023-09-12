package ageProgram;

public class AgeProgram {

	public static void main(String[] args) {
		
		// 1. Tee ohjelma, joka kertoo iän perusteella, mitä kukakin saa tai voi tehdä
		
		System.out.println("************************************************\n");
		
		
		int age = 10;
		
		// Tulostusehdot
		
		if (age >= 10 && age < 18)
		{
			System.out.println("you are a Minor");
		}
		
		else 
			{
				System.out.println("You are an Adult");
			}
		
		
		System.out.println("************************************************\n");
		
		
		/* 		aja ohjelma. Muuta

				int ika = 20;

				ja aja ohjelma uudelleen. Huomaatko eron?
		*/
		
		age = 20;
		
		// Tulostusehdot
		
		if (age >= 10 && age < 18)
		{
			System.out.println("you are a Minor");
		}
		
		else 
		{
			System.out.println("You are an Adult");
		}
		
		System.out.println("************************************************\n");
		
		
		// 3. Laajennetaanpa hieman ohjelmamme toiminnallisuutta. Erotetaanpa eläkeläiset seuraavaksi. 
		//	  Kuvitellaan, että käytössä on kiinteä eläkeikä 65 vuodesta alkaen.
		
		age = 65;
		
		if (age > 0 && age < 18)
		{
			System.out.println("You are a minor.");
		}
		
		else if (age >= 65)
		{
			System.out.println("You are a pentioner.");
		}
		
		else 
		{
			System.out.println("You are an adult.");
		}
		
		System.out.println("************************************************\n");
		
		
		// 4. Tarkennetaanpa tuota alaikäistä sen verran, että 15-vuotias saa ajaa mopoa. 
		//    Lisätään koodiin seuraava ehto:
			
		age = 15;
		
		
		if (age > 0 && age < 18 )
		{
			System.out.println("You are a minor");
			
			if (age > 15)
			{
				System.out.println("You can drive a moped");
				}
			
			}
		
		else if (age >= 65)
		{
			System.out.println("You are a pentioner");
		}
		
		else
		{
			System.out.println("You are an adult");
		}
		
		System.out.println("************************************************\n");
		
		//  Tehtävä 1: Laajenna ohjelmaa siten, että ohjelma osaa kertoa 16-17-vuotiaille, 
		//  että he voivat ajaa kevaria.
		
		age = 17;
		
		
		if (age > 0 && age < 18)
		{
			System.out.println("You are a minor");
			
			if (age > 15)
			{
				System.out.println("You can drive a moped");
				}
				
				if (age >= 16 && age < 18)
				{
					System.out.println("You can drive a A2 class motorcycle)");
				}
			
			}
		
		else if (age >= 65)
		{
			System.out.println("You are a pentioner");
		}
		
		else
		{
			System.out.println("You are an adult");
		}
		
		System.out.println("************************************************\n");
		
		// Tehtävä 2: Laajenna ohjelmaa niin, että se kertoo 18-vuotiaalle, 
		// että hän on juuri tullut täysi-ikäiseksi ja saa ajaa autoa.
		
		age = 18;
		
		if (age > 0 && age < 18)
		{
			System.out.println("You are a minor");
			
			if (age > 15)
			{
				System.out.println("You can drive a moped");
				}
				
				if (age >= 16 && age < 18)
				{
					System.out.println(" You can drive a A2 class motorcycle)");
				}
		}
		
		/* I tried to make this code below to print the text
		 * after previous if statement. It didn't print out anything.
		 * Now when I place is as an else if statement it overrides the final else statement.
		 * 
		 * 
		 */
		else if (age >= 18)
		{
			System.out.println("You are an adult now and you can drive a car!");
		}
			

		
		else if (age >= 65)
		{
			System.out.println("You are a pentioner");
		}
		
		else
		{
			System.out.println("You are an adult");
		}
		
		System.out.println("************************************************\n");
		
		// Tehtävä 3: Laajenna tehtävää niin, että aikuisille ilmoitetaan tasavuosikymmenistä onnentoivotus.
	
		
		age = 20;
		
		
		if (age > 0 && age < 18)
		{
			System.out.println("You are a minor");
			
			if (age > 15)
			{
				System.out.println("You can drive a moped");
				}
				
				if (age >= 16 && age < 18)
				{
					System.out.println(" You can drive a A2 class motorcycle)");
				}
				
		}
		
		/* I tried to make this code below to print the text
		 * after previous if statement. It didnt print out anything.
		 * Now when I place is as an else if statement it overrides the final else statement.
		 * 
		 * 
		 */
		// I tried to google how to make this same comparison with a loop. Didn't find anything now
		
		else if (age == 20 || age == 30 || age == 40 || age == 50 || age == 60 || age == 70 || age == 80)
		{
			System.out.println("Round numbers, Happy BD!");
			}
		
		else if (age >= 18)
		{
			System.out.println("You are an adult now and you can drive a car!");
		}
	
		else if (age >= 65)
		{
			System.out.println("You are a pentioner");
		}
		
		else
		{
			System.out.println("You are an adult");
		}
		
		System.out.println("************************************************\n");
			
		}
	}
		



