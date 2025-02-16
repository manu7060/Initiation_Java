import java.util.Scanner;
public class NombreDeE {

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner(System.in);
		int nombreDeE;
		String phrase;
		
		System.out.print("Entrez une phrase, je vais compter le nombre de lettres e : ");
		phrase = lireClavier.nextLine().toLowerCase();
		
		nombreDeE = 0;
		for (int i=0; i < phrase.length(); ++i) {
			if (phrase.charAt(i) == 'e') {
				++nombreDeE;
			}// fin if
		}// fin for
		
		System.out.println("Nombre de lettre e : " + nombreDeE);

	}// fin main
}// fin programme