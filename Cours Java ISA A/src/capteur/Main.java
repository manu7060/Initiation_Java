package capteur;

import java.util.Scanner;

/***
 * @author E. Dauvin
 * Programme capteur de température TMP35/36/37
 */
public class Main {
	public static void main(String[] args) {
		// Déclarer les tableaux
		int NOMBRE = 3;
		String tabCapteur[] = new String[NOMBRE];
		int tabTension[] = new int[NOMBRE];
		float tabTemperature[] = new float[NOMBRE];
		
		// Remplir les tableaux
		for (int i=0; i<NOMBRE; ++i) {
			System.out.println("Entre les valeurs pour le capteur " + i);
			tabCapteur[i] = lireTypeCapteur();
			tabTension[i] = lireTensionCapteur(tabCapteur[i]);
			tabTemperature[i] = calculerTemperature(tabCapteur[i], tabTension[i]);
		}
		
		// Afficher le contenu des tableaux
		System.out.println("\nAffichage des valeurs:");
		for (int i=0; i<NOMBRE; ++i) {
			System.out.println("Capteur no " + i + " " +tabCapteur[i] + ", " + tabTension[i] + " mV, " + tabTemperature[i] + " degrés C");
		}
		
		System.out.println("Terminé");

	}// fin main
	
	
	public static String lireTypeCapteur() {
		Scanner lireClavier = new Scanner(System.in);
		String typeCapteur;
		
		System.out.print("Entrez le type de capteur : ");
		typeCapteur = lireClavier.next();
		while (!typeCapteur.equalsIgnoreCase("tmp35") && !typeCapteur.equalsIgnoreCase("tmp36") && !typeCapteur.equalsIgnoreCase("tmp37")) {
			System.out.println("Ce n'est pas un capteur valide.");
			System.out.print("Entrez le type de capteur : ");
			typeCapteur = lireClavier.next();
		}// fin while
		
		return (typeCapteur);
	}// fin fonction
	
	public static int lireTensionCapteur(String typeCapteur) {
		Scanner lireClavier = new Scanner(System.in);
		int tensionCapteur;
		
		System.out.print("Entrez la tension du capteur " + typeCapteur + " : ");
		tensionCapteur = lireClavier.nextInt();
		while (tensionCapteur < 0 && tensionCapteur > 33000) {
			System.out.print("La tension n'est pas valide.");
			System.out.print("Entrez la tension du capteur " + typeCapteur + " : ");
			tensionCapteur = lireClavier.nextInt();
		}// fin while
		return (tensionCapteur);
	}// fin fonction
	
	public static float calculerTemperature (String typeCapteur, int tensionCapteur) {
		float temperatureCapteur;
		switch (typeCapteur) {
		case "tmp35": {
			temperatureCapteur = ((tensionCapteur - 250f) / 10f) + 25f;
			break;
		}
		case "tmp36": {
			temperatureCapteur = ((tensionCapteur - 750f) / 10f) + 25f;
			break;
		}
		case "tmp37": {
			temperatureCapteur = ((tensionCapteur - 500f) / 20f) + 25f;
			break;
		}
		default:
			System.out.println("Erreur de type de capteur dans le calcul de la température");
			temperatureCapteur = -100f;
		}
		
		return (temperatureCapteur);
		
	}// fin fonction
}// fin programme