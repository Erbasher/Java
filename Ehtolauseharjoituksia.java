package ehtoLauseHarjoituksia;

public class Ehtolauseharjoituksia {

	public static void main(String[] args) {
		
		// 1. Tee kaksi muuttujaa - luku1 ja luku2. 
		//	Vaihtele niiden arvoja alla olevia ehtoja tehdessä.
			
			int luku1 = 2;
			int luku2 = 3;
			int luku3 = 4;
			
			System.out.println("Ehtolause harjoituksia osa 1");
			System.out.println("****************************\n");
			
		//  1. Tutki, onko luku1 yhtä suuri kuin luku2.
			
			if (luku1 == luku2)
			{
				System.out.println("Luku1 on yhtä suuri, kuin luku2");
			}
			
			else
			{
				System.out.println("Luku1 on erisuuri, kuin luku2");
			}
			
			
		//  2. Tutki, onko luku1 suurempi kuin luku2.

			if (luku1 > luku2)
			{
				System.out.println("Luku1 on suurempi, kuin luku2");
			}
			
			else
			{
				System.out.println("Luku1 ei ole surempi, kuin luku2");
			}
			
		//  3. Tutki, onko luku1 suurempi tai yhtä suuri kuin luku2	
			
			if (luku1 >= luku2)
			{
				System.out.println("Luku1 on suurempi tai yhtäsuuri, kuin luku2");
			}
			
			else
			{
				System.out.println("Luku1 ei ole suurempi tai yhtäsuuri, kuin Luku2");
			}
			
		//  4. Tutki, onko luku1 eri suuri kuin luku2
			
			if (luku1 != luku2)
			{
				System.out.println("Luku1 on erisuuri, kuin Luku2\n");
			}
			
			else
			{
				System.out.println("Luku1 on yhtäsuuri, kuin Luku2");
			}
			
			
			System.out.println("Ehtolause harjoituksia osa 2");
			System.out.println("****************************\n");
			
		//  1. Tutki, onko luku1 ja luku2 yhtä suuria TAI luku2 ja luku3 yhtä suuria
			
			if (luku1 == luku2)  
			{
				System.out.println("Luku1 on yhtäsuuri, kuin Luku2");
			}
			
			else if (luku2 == luku3)
			{
				System.out.println("Luku2 on yhtäsuuri, kuin Luku3");
			}
			
			else
			{
				System.out.println("Luvut eivät ole yhtäsuuria");
			}
			
			
		//  2. Tutki, onko luku1 suurempi kuin luku2 JA luku1 yhtä suuri kuin luku3
			
			if (luku1 > luku2 && luku2 == luku3)
			{
				System.out.println("Luku1 on suurempi, kuin luku2");
			}
			
			else if (luku1 == luku3)
			{
				System.out.println("Luku1 on yhtäsuuri, kuin luku3");
			}
			
			else
			{
				System.out.println("Väittämät eivät pidä paikkaansa");
			}
			
		//	3. Tutki, onko luku1 ja luku2 ja luku3 yhtä suuria
			
			if (luku1 == luku2 && luku2 == luku3)
			{
				System.out.println("Luku1, Luku2 ja Luku3 ovat yhtäsuuria");
			}
			
			else
			{
				System.out.println("Luvut eivät ole yhtäsuuria keskenään");
			}
			
		//	4. Tutki, onko luku1 suurempi kuin luku2. Jos ei ole, tutki onko luku2 suurempi kuin luku3
			
			if (luku1 > luku2)
			{
				System.out.println("Luku1 on suurempi, kuin Luku2");
			}
			
			else if (luku2 > luku3)
			{
				System.out.println("Luku2 on suurempi, kuin Luku3");
			}
			
			else
			{
				System.out.println("Väittämät ovat epätosia");
			}
			
		//	5. Tutki, onko luku1 ja luku2 yhtä suuria. 
		// 	Jos ei ole, tutki, onko luku1 ja luku3 yhtä suuria
			
			if (luku1 == luku2)
			{
				System.out.println("Luku1 ja Luku2 ovat yhtäsuuria");
			}
			
			else if (luku1 == luku3)
			{
				System.out.println("Luku1 ja Luku3 ovat yhtäsuuria");
			}
			
			else
			{
				System.out.println("Väittämät ovat epätosia\n");
				
				
			}
			
			System.out.println("Ehtolause harjoituksia osa 3");
			System.out.println("****************************\n");
			
		// 3. Tee kolme muuttujaa - nimi1, nimi2 ja nimi3
			
			String nimi1 = "Jaana";
			String nimi2 = "Saana";
			String nimi3 = "Baana";
			
		//  1. Tutki, onko nimi1 ja nimi2 samoja
			
			if (nimi1 == nimi2)
			{
				System.out.println("Verrattu == operaattorilla: Jos tämä tulostuu nii1 ja nimi2 ovat samoja");
			}
			
			else 
			{
				System.out.println("Vertailtu == operaattorilla: Jos tämä tulostuu Nimi1 ja Nimi2 eivät ole samoja");
			}
			
		//  Sama tehtävä equls() metodilla
			
			System.out.println("Sama tehtävä, kuin edellinen equals.operaattorilla, tulos: " + nimi1.equals(nimi2));
			
			
			
		// 	Oma lisätehtävä jossa tutkin equals() metodin käyttöä merkkkinjonojen vertailussa
			
			if (nimi1.equals(nimi2) || (nimi2.equals(nimi3)))
					{
				System.out.println("Jompi kumpi väittämistä on tosi");
					}
			
			else 
			{
				System.out.println("Väittämät eivät ole tosia");
			}
}
}