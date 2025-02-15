import java.util.Scanner;

public class Examen1 {

	private static Scanner lireClavier;

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner(System.in);
		int menu;
		
		final int nbCapteur = 5;
		String idCapteur[] = new String [nbCapteur];
		String typeCapteur[] = new String[nbCapteur];
		float valeurCapteur[] = new float[nbCapteur];
		
		
		System.out.println("Bienvenue dans le contrôle de la serre\n");
		do {
			System.out.println("1. Ajouter un capteur");
			System.out.println("2. Afficher la liste des capteurs");
			System.out.println("3. Entrer la valeur d'un capteur");
			System.out.println("4. Afficher le tableau de bord");
			System.out.println("5. Quitter");
			System.out.print("\t> ");
			menu = lireClavier.nextInt();
			
			switch (menu) {
			case 1:
				ajouterCapteur(idCapteur);
				break;
			case 2:
				afficherCapteur(idCapteur);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("Sortie");
				break;
			default:
				System.out.println("Erreur, recommencez");
					
			}
		
		}while (menu != 5);
		
		System.out.println("Terminé");
		lireClavier.close();

	}// fin programme principal

	public static void ajouterCapteur(String idCapteur[]) {
		int id;
		lireClavier = new Scanner(System.in);
		System.out.print("Indiquez le numéro du capteur : ");
		id = lireClavier.nextInt();
		if (id >= 0 && id < idCapteur.length) {
			System.out.print("Entrer le nom du capteur " + id + " > ");
			idCapteur[id] = lireClavier.next();
		}
		else
			System.out.println("Erreur, ce n'est pas un id de capteur valide");
			
		System.out.println();
	
	}
	
	public static void afficherCapteur(String idCapteur[]) {
		System.out.println();
		System.out.println("Liste des capteurs:");
		for (int i=0; i<idCapteur.length; ++i) {
			if (idCapteur[i] != null) {
			System.out.println(i + " : " + idCapteur[i]);
			}
		}
		System.out.println();
		
	}
	
	public static void encoderValeur() {
		
	}
	
	public static void afficherCommande() {
		
	}
	
}// fin programme