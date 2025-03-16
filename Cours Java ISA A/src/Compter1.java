import java.util.Scanner;

public class Compter1 {

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner(System.in);
		String phrase;
		int nombreDeE = 0;
		
		System.out.print("Entrez une phrase : ");
		phrase = lireClavier.nextLine();
		phrase = phrase.toLowerCase(); // transformer tout en minuscule
		
		for (int i=0; i < phrase.length(); ++i) {
			
			if (phrase.charAt(i) == 'e') {
				++nombreDeE;
			}// fin-if

		}// fin for
		
		System.out.println("J'ai compter : " + nombreDeE + " de fois la lettre e.");
		System.out.println("Terminé");
		

	}// fin main
}// fin programme