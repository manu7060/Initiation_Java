import java.util.Scanner;

public class Commercial2 {

	public static void main(String[] args) {

		Scanner lireClavier = new Scanner (System.in);
		float montant, commission, commissionPourcent;
		float taux1=0.05f, taux2=0.10f, taux3=0.15f;

		System.out.print("Entrez le montant : ");
		montant = lireClavier.nextFloat();

		if (montant > 0) {
			if (montant <= 5000) {
				commission = montant * taux1;
			}
			else if (montant <= 10000) {
				commission = 5000f * taux1 + (montant - 5000f) * taux2;
			}
			else {
				commission = 5000f * taux1 + 5000f * taux2 + (montant - 10000f) * taux3;
			}
			System.out.printf("La commission est de : %.2f €\n", commission);
			commissionPourcent = (commission/montant)*100f;
			System.out.printf("La commission est de : %.1f %%\n\n", commissionPourcent);
		}
		else 
			System.out.println("Le montant est trop petit");

	}
}