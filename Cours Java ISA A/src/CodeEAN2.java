import java.util.Scanner;

public class CodeEAN2 {

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner(System.in);
		String codeEAN;
		int controle, somme;
		int nombre = 1;
		
		
		do {
				
			System.out.print("Code EAN " + nombre + ": ");
			codeEAN = lireClavier.next();
			
			if (codeEAN.length() == 8) {
				// vérification du code EAN8
				somme = 0;
				for (int i=0; i<codeEAN.length()-1; ++i) {
					if (i % 2 == 0) {
						somme += Character.getNumericValue(codeEAN.charAt(i)) * 3;
					}
					else {
						somme += Character.getNumericValue(codeEAN.charAt(i));
					}
				}// fin for
				controle = 10 - (somme % 10);
				if (controle == 10) {
					controle = 0;
				}
				if (controle == Character.getNumericValue(codeEAN.charAt(codeEAN.length()-1))) {
					System.out.println("code EAN8 OK");
					nombre++;
				}
				else {
					System.out.println("code EAN8 NOK");
				}
			}
			else if (codeEAN.length() == 13) {
				// vérification du code EAN13
				somme = 0;
				for (int i=0; i<codeEAN.length()-1; ++i) {
					if (i % 2 != 0) {
						somme += Character.getNumericValue(codeEAN.charAt(i)) * 3;
					}
					else {
						somme += Character.getNumericValue(codeEAN.charAt(i));
					}
				}// fin for
				controle = 10 - (somme % 10);
				if (controle == 10) {
					controle = 0;
				}
				if (controle == Character.getNumericValue(codeEAN.charAt(codeEAN.length()-1))) {
					System.out.println("code EAN13 OK");
					nombre++;
				}
				else {
					System.out.println("code EAN13 NOK");
				}			
			}
		
		} while(!codeEAN.equals("0")); // 
		
		System.out.println("Terminé");

	}// fin main
}// fin programme