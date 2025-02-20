import java.util.Scanner;

public class Boucle2 {

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner(System.in);
		float cote, surface;
		
		do {
			System.out.print("Entrez le nouveau coté ou 0 pour sortir : ");
			cote = lireClavier.nextFloat();
			if (cote > 0) {
				surface = cote * cote;
				System.out.println("La surface du caré est : " + surface);
			}// fin-if

		} while(cote > 0); // fin do_while
		
		System.out.println("Terminé");

	}// fin main
}// fn programme