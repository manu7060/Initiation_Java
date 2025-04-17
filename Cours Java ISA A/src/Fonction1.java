import java.util.Scanner;

public class Fonction1 {

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner(System.in);
		int tableau1[] = new int[40];
		int tableau2[] = new int[20];
		char choix;
		
		System.out.print("Entrez i ou b : ");
		choix = lireClavier.nextLine().charAt(0);
		
		
		MesFonctions.remplirTableau(tableau1);
		MesFonctions.remplirTableau(tableau2);
		MesFonctions.afficherTableau(tableau1);
		MesFonctions.afficherTableau(tableau2);
		
		if (choix == 'b') {
			System.out.println("Je vais faire le tri bulle");
			MesFonctions.triBulle(tableau1);
		}
		else {
			System.out.println("Je vais faire le tri insertion");
			MesFonctions.triInsertion(tableau1);
		}
		
		MesFonctions.afficherTableau(tableau1);
		
		System.out.println("Terminé");
	}// fin main

}// fin programme