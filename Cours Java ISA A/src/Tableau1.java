<<<<<<< HEAD
import java.util.Arrays;

public class Tableau1 {

	public static void main(String[] args) {
		
		// initialisation 
		int tab[] = new int[20];
		
		// initialisation du tableau avec des valeurs aléatoires
		for (int i=0; i<tab.length; ++i) {
			tab[i] = (int)(Math.random() * 100);
		}
		
		// Afficher le tableau
		for (int valeur : tab) {
			System.out.print(valeur + " ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(tab));

=======
import java.util.Scanner;

public class Tableau1 {

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner(System.in);
		// déclaration du tableau
		int tab[] = new int[10];
		
		// initialisation du tableau
		for (int i=0; i<tab.length; ++i) {
			tab[i] = (int)(Math.random() * 100);
		}
		
		// Affichage du tableau
		for (int i=0; i<tab.length; ++i) {
			System.out.println("La valeur du tableau à l'indice " + i + " : " + tab[i]);
		}
		
		// Rechercher le plus grand
		int lePlusGrand;
		int indiceDuPlusGrand;
		lePlusGrand = tab[0];
		indiceDuPlusGrand = 0;
		for (int i=0; i<tab.length; ++i) {
			if (tab[i] > lePlusGrand) {
				lePlusGrand = tab[i];
				indiceDuPlusGrand = i;
			}// fin-if
		}// fin-for

		// Rechercher le plus petit
		int lePlusPetit;
		int indiceDuPlusPetit;
		lePlusPetit = tab[0];
		indiceDuPlusPetit = 0;
		for (int i=0; i<tab.length; ++i) {
			if(tab[i] < lePlusPetit){
				lePlusPetit = tab[i];
				indiceDuPlusPetit = i;
			}
		}// fin-for
		
		// Calcul de la somme et de la moyenne
		int somme = 0;
		float moyenne;
		for (int i=0; i<tab.length; ++i) {
			somme += tab[i];
		}
		moyenne = (float)(somme) / tab.length;
		
		System.out.println("\nLe plus grand est : " + lePlusGrand + " à l'indice : " + indiceDuPlusGrand);
		System.out.println("Le plus petit est : " + lePlusPetit + " à l'indice : " + indiceDuPlusPetit);
		System.out.println("La somme est de " + somme + " et la moyenne de " + moyenne);

		// Affichage du tableau
		for (int valeur : tab) {
			System.out.print(valeur + " ");
		}
		System.out.println();
		// permutation des éléments
		int temp;
		temp = tab[indiceDuPlusGrand];
		tab[indiceDuPlusGrand] = tab[indiceDuPlusPetit];
		tab[indiceDuPlusPetit] = temp;
		// Affichage du tableau
		for (int valeur : tab) {
			System.out.print(valeur + " ");
		}
		
>>>>>>> branch 'master' of https://github.com/manu7060/Initiation_Java.git
	}// fin main
}// fin programme