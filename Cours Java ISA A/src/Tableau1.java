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

	}// fin main
}// fin programme