import java.util.Scanner;

public class CodeCouleur1 {

	public static void main(String[] args) {
		// Déclaration des variables
		Scanner lireClavier = new Scanner(System.in);
		String couleur1, couleur2, couleur3, couleur4;
		long resistance = 0;
		float tolerance = 0;
		
		// Saisie des valeurs au clavier;
		System.out.print("Entrez la couleur 1 : ");
		couleur1 = lireClavier.nextLine().toLowerCase();
		System.out.print("Entrez la couleur 2 : ");
		couleur2 = lireClavier.nextLine().toLowerCase();
		System.out.print("Entrez la couleur 3 : ");
		couleur3 = lireClavier.nextLine().toLowerCase();
		System.out.print("Entrez la couleur 4 : ");
		couleur4 = lireClavier.nextLine().toLowerCase();
		
		// Calcul de la résistance
		switch(couleur1) {
		case "brun":
			resistance = 10;
			break;
		case "rouge":
			resistance = 20;
			break;
		case "orange":
			resistance = 30;
			break;
		case "jaune":
			resistance = 40;
			break;
		case "vert":
			resistance = 50;
			break;
		case "bleu":
			resistance = 60;
			break;
		case "violet":
			resistance = 70;
			break;
		case "gris":
			resistance = 80;
			break;
		case "blanc":
			resistance = 90;
			break;
		default:
			System.out.println("Couleur 1, ce n'est pas une couleur valide");
			break;
		}// fin switch
		
		switch(couleur2) {
		case "noir":
			break;
		case "brun":
			resistance += 1;
			break;
		case "rouge":
			resistance += 2;
			break;
		case "orange":
			resistance += 3;
			break;
		case "jaune":
			resistance += 4;
			break;
		case "vert":
			resistance += 5;
			break;
		case "bleu":
			resistance += 6;
			break;
		case "violet":
			resistance += 7;
			break;
		case "gris":
			resistance += 8;
			break;
		case "blanc":
			resistance += 9;
			break;
		default:
			System.out.println("Couleur 2, ce n'est pas une couleur valide");
			break;
		}// fin switch
		
		switch(couleur3) {
		case "noir":
			break;
		case "brun":
			resistance *= 10;
			break;
		case "rouge":
			resistance *= 100;
			break;
		case "orange":
			resistance *= 1000;
			break;
		case "jaune":
			resistance *= 10000;
			break;
		case "vert":
			resistance *= 100000;
			break;
		case "bleu":
			resistance *= 1000000;
			break;
		case "violet":
			resistance *= 10000000;
			break;
		case "gris":
			resistance *= 1000000000;
			break;
		case "blanc":
			resistance *= 1000000000;
			break;
		default:
			System.out.println("Couleur 3, ce n'est pas une couleur valide");
			break;
		}// fin switch
		
		switch(couleur4) {
		case "noir":
			break;
		case "brun":
			tolerance = 0.01f;
			break;
		case "rouge":
			tolerance = 0.02f;
			break;
		case "orange":
			tolerance = 0.03f;
			break;
		case "jaune":
			tolerance = 0.04f;
			break;
		case "vert":
			tolerance = 0.005f;
			break;
		case "bleu":
			tolerance = 0.0025f;
			break;
		case "violet":
			tolerance = 0.0010f;
			break;
		case "gris":
			tolerance = 0.0005f;
			break;
		case "or":
			tolerance = 0.05f;
			break;
		case "argent":
			tolerance = 0.10f;
		default:
			System.out.println("Couleur 4, ce n'est pas une couleur valide");
			break;
		}// fin switch
		
		// Calcul des résultats
		long valeurTolerance = (long)(resistance * tolerance);
		// Affichage des résultats
		System.out.println("La valeur de la résistance est de " + resistance + " \u03a9. La tolérance est de " + (tolerance * 100) + "%");
		System.out.println("La valeur de la tolérance est de \u00b1" + (valeurTolerance) + " \u03A9");
	

	}// fin main
}// fin programme
