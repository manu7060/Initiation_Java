import java.util.Scanner;

public class Boucle3 {

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner(System.in);
		char choix;
		float cote, largeur, longueur, surface;
		
		System.out.println("Entrez 'c' pour le carré");
		System.out.println("Entrez 'r' pour le rectangle");
		System.out.println("Entrez une autre lettre pour quitter");
		System.out.print("Entre votre choix : ");
		choix = lireClavier.next().charAt(0);
		
		while (choix == 'c' || choix == 'r') {
			System.out.println("Je suis dans la boucle");
			switch(choix) {
			case 'c':
				// calculer le carré
				System.out.println("Je calcule la surface du carré");
				System.out.print("Entrez le coté du carré : ");
				cote = lireClavier.nextFloat();
				surface = cote * cote;
				System.out.println("La surface du carré est : " + surface);
				System.out.println();
				break;
			case 'r':
				// calculer le rectangle
				System.out.println("Je calcule la surface du rectangle");
				System.out.print("Entrez la largeur du rectangle : ");
				largeur = lireClavier.nextFloat();
				System.out.print("Entrez la longueur du rectangle : ");
				longueur = lireClavier.nextFloat();
				surface = largeur * longueur;
				System.out.println("La surface du rectangle est : " + surface);
				System.out.println();
				break;
			default:
				System.out.println("Le choix n'est ni 'c' ni 'r' ");
			}// fin switch

			System.out.println();
			System.out.println("Entrez 'c' pour le carré");
			System.out.println("Entrez 'r' pour le rectangle");
			System.out.println("Entrez une autre lettre pour quitter");
			System.out.print("Entre votre choix : ");
			choix = lireClavier.next().charAt(0);
			System.out.println();

		}// fin while
		
		System.out.println("Terminé");

	}// fin main
}// fin programme