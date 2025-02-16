
import java.util.Scanner;

public class Paypal {

	public static void main(String[] args ) {
		Scanner lireClavier = new Scanner(System.in);

		final float FRAISVAR= (float)0.034;
		final float FRAISFIXE = (float)0.35;
		float montant, commission;

		System.out.print("Entrez le montant de la vente : ");
		montant = lireClavier.nextFloat();
		commission = FRAISFIXE + montant * FRAISVAR;

		if (commission >= 0 ) {
			System.out.println("La commission paypal est de : " + commission);
			System.out.println("Le vendeur va recevoir:" + (montant - commission));
		}
		else {
			System.out.println("Le montant est trop petit");
		}

	} // fin main
}// fin program