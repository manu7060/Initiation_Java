
public class TriBulle {

	public static void main(String[] args) {
		int tableau[] = new int[10];
		int tmp;

		for (int i=0; i<tableau.length; ++i) {
			tableau[i] = (int)(Math.random() * 100);
		}

		System.out.println("Tableau non trié");
		for (int valeur:tableau) {
			System.out.print(valeur + " ");
		}
		System.out.println();

		for (int i= tableau.length; i > 1; --i) {
			for (int j = 0; j <i-1; ++j) {
				if (tableau[j+1] < tableau[j]) {
					tmp = tableau[j];
					tableau[j] = tableau[j+1];
					tableau[j+1] = tmp;
				}
			}
		}

		System.out.println("Tableau trié");
		for (int valeur:tableau) {
			System.out.print(valeur + " ");
		}

	}
}