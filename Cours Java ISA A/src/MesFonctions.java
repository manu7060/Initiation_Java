
public class MesFonctions {
	
	/***
	 * Cette fonction rempli un tableau de nombres entiers 
	 * @param tab
	 */
	public static void remplirTableau (int tab[]) {
		for (int i=0; i<tab.length; ++i) {
			tab[i] = (int)(Math.random() * 100);
		}// fin for
	}// fin fonction

	/***
	 * Cette fonction affiche tous les éléments d'un tableau
	 * @param tab
	 */
	public static void afficherTableau (int tab[]) {
		for (int i=0; i<tab.length; ++i) {
			System.out.print(tab[i] + " ");
		}// fin for
		System.out.println();
	}// fin fonction
	
	public static void triBulle (int tab[]) {
		// Ajouter ici le code du tri à bulle
		int tmp;
		// boucle de tri
		for (int i= tab.length; i > 1; --i) {
			for (int j = 0; j <i-1; ++j) {
				if (tab[j+1] < tab[j]) {
					tmp = tab[j];
					tab[j] = tab[j+1];
					tab[j+1] = tmp;
				}// fin if
			}// fin for
		}// fin for
	}// fin fonction
	
	public static void triInsertion(int tab[]) {
		// ajouter ici le code du tri insertion
		int indiceMin, tmp;
		// boucle de tri
		for (int ref=0; ref<tab.length; ++ref) {
			indiceMin=ref;
			for (int j=ref+1; j < tab.length; ++j) {
				if (tab[j] < tab[indiceMin]) {
					indiceMin = j;
				}// fin if
			}// fin for
			// permutation
			tmp = tab[ref];
			tab[ref] = tab[indiceMin];
			tab[indiceMin] = tmp;
		}// fin for
	}// fin fonction
	
}
