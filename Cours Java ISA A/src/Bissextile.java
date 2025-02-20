import java.util.Scanner;

public class Bissextile {

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner (System.in);
		int annee;
		
		System.out.print("Entre une année : ");
		annee = lireClavier.nextInt();
		
		if (((annee % 4 == 0) && (annee % 100 != 0)) || (annee % 400 == 0)) {
			System.out.println("C'est une année bissextile");
		}
		else {
			System.out.println(("Ce n'est pas une année bissextile"));
		}// fin if
		
		System.out.println(("Terminé"));

	}// fin main
}// fin programme