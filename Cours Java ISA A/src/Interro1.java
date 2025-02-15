import java.util.Scanner;
public class Interro1 {

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner(System.in);
		int nLignes;
		int numLigne;
		int nEspaces;
		final char cRempli = '*';
		int j;

		System.out.print ("combien de lignes ? ") ;
		nLignes = lireClavier.nextInt();
		for	(numLigne=0 ; numLigne<nLignes ; numLigne++) {
			
			nEspaces = nLignes - numLigne - 1;
			for (j=0 ; j < nEspaces ; j++)
				System.out.print (' ') ;
			for (j=0 ; j < 2*numLigne+1 ; j++) 
				System.out.print (cRempli);
			System.out.println () ;
		}
	}
}




