
public class TriSelection {

	public static void main(String[] args) {
		int indiceMin, tmp;
		int tableau[] = new int[10];

		for (int i=0; i<tableau.length; ++i) {
			tableau[i] = (int)(Math.random() * 100);
		}

		System.out.println("Tableau non trié");
		for (int valeur:tableau) {
			System.out.print(valeur + " ");
		}// fin for
		System.out.println();

		for (int ref=0; ref<tableau.length; ++ref) {
			indiceMin=ref;
			for (int j=ref+1; j < tableau.length; ++j) {
				if (tableau[j] < tableau[indiceMin]) {
					indiceMin = j;
				}// fin if
			}// fin for
			// permutation
			tmp = tableau[ref];
			tableau[ref] = tableau[indiceMin];
			tableau[indiceMin] = tmp;
		}// fin for

		System.out.println("Tableau trié");
		for (int valeur:tableau) {
			System.out.print(valeur + " ");
		}// fin for

	}// fin main
}// fin programme