import java.util.Scanner;

public class Voyelles {

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner(System.in);
		String voyelles = "aeiou";
		String phrase;
		int nombreDeVoyelles = 0;
		
		System.out.print("Entrez une phrase, je compte le nombre de voyelles (" + voyelles + ") : ");
		phrase = lireClavier.nextLine().toLowerCase();
		
		for (int i = 0; i < phrase.length(); ++i) {
			for (int j = 0; j < voyelles.length(); ++j) {
				if (phrase.charAt(i) == voyelles.charAt(j))
					nombreDeVoyelles++;
			}//fin for 
		}// fin for

		System.out.println("Le nombre de voyelles dans la phrase : " + nombreDeVoyelles);

	}// fin main
}// fin programme