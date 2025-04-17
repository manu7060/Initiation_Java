import java.util.Scanner;

public class CodeEAN13 {

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner(System.in);
		String codeBarre;
		int somme = 0;
		int reste;
		
	
		
		do {
			System.out.print("Entrez un code barre : ");
			codeBarre = lireClavier.nextLine();
			somme = 0;
			
			if (codeBarre.matches("\\d{13}")) {
				for (int i=0; i < codeBarre.length() - 1 ; ++i) {
					
					if ( i%2 == 0) {
						// l'indice est pair
						somme += Character.getNumericValue(codeBarre.charAt(i));
					}
					else {
						// l'indice est impaire
						somme += Character.getNumericValue(codeBarre.charAt(i)) * 3;
					}// fin-if
				} // fin for
				
				reste = somme % 10;
				
				if (reste == 0) {
					reste = 0;
				}
				else {
					reste = 10 - reste;
				}
				
				if (reste == Character.getNumericValue(codeBarre.charAt(codeBarre.length() - 1))) {
					System.out.println("Le code barre est bon");
				}
				else {
					System.out.println("Le code barre n'est pas bon");
				}// fin if
				}
			else {
				System.out.println("Le code barre n'est pas un EAN13");
			}// fin if

		}while(!codeBarre.equalsIgnoreCase("fin"));

		System.out.println("Terminé");
		
	}// fin main
}// fin programme