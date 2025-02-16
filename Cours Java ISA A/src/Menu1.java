import java.util.Scanner;

public class Menu1 {

	public static void main(String[] args) {

		Scanner lireClavier = new Scanner(System.in);
		char choix;
		double rayon, cote;
		do {
			System.out.println("a : Calculer la surface du cercle");
			System.out.println("b : Calculer la surface du carré");
			System.out.print("Entre votre choix : ");
			choix = lireClavier.next().charAt(0);

			switch (choix) {

			case 'a':
			case 'A':
				System.out.println("Calcul du cercle");
				System.out.print("Encodez le rayon : ");
				rayon = lireClavier.nextDouble();
				System.out.println("La surface du cercle : " + (Math.PI * rayon * rayon));

				break;
			case 'b':
				System.out.println("Calcul du carré");
				System.out.print("Entrez le coté : ");
				cote = lireClavier.nextDouble();
				System.out.println("La surface du carré : " + (cote * cote));

				break;
			default:
				System.out.println("Ce n'est pas un choix valable");
			} // fin switch

		} while (choix != 'q');

		System.out.println("Terminé");

	}
}