import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner(System.in);
		int nLignes;
		int nEspaces;
		final char cRempli = '*';

		System.out.print ("combien de lignes ? ") ;
		nLignes = lireClavier.nextInt();

		for	(int numLigne=0 ; numLigne<nLignes ; numLigne++) {
			nEspaces = nLignes - numLigne - 1;
			for (int i=0 ; i < nEspaces ; i++) {
				System.out.print (' ') ;
			}// fin for
			for (int i=0 ; i < 2 * numLigne + 1 ; i++) {
				System.out.print (cRempli);
			}// fin for
			System.out.println () ;
		}// fin for
		
	}// fin main
}// fin programme