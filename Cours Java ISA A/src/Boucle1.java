import java.util.Scanner;

public class Boucle1 {

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner(System.in);
		
		float cote, surface;
		
		System.out.print("Entrez le coté ou 0 pour sortir : ");
		cote = lireClavier.nextFloat();
		
		while (cote > 0) {
			surface = cote * cote;
			System.out.println("La surface du caré est : " + surface);

			System.out.print("Entrez le nouveau coté ou 0 pour sortir : ");
			cote = lireClavier.nextFloat();

		}// fin while
		
		System.out.println("Terminé");

	}// fin main
}// fn programme