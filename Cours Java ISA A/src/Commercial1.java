import java.util.Scanner;

public class Commercial1 {

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner(System.in);
		float montant, commission;
		float taux1 = (float)0.05, taux2 = (float)0.10, taux3 = (float)0.15;

		System.out.print("Entrez le montant de la vente : ");
		montant = lireClavier.nextFloat();

		if (montant > 0) {
			if (montant <= 5000) {
				commission = montant * taux1;
			}// fin if ligne 18
			else 
				if (montant <= 10000) {
					commission = montant * taux2;
				}// fin if ligne 21
				else {
					commission = montant * taux3;
				}// fin else de la ligne 24

			System.out.println("Le montant de la commission est : " + commission + " €");
		}// fin if (ligne 17)
		else {
			System.out.println("Le montant est trop petit");
		}// fin else de la ligne 30

		System.out.println("Terminé");
	}// fin main
}// fin programme