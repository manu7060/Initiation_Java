
	import java.util.Scanner;
	/***
	 * @author hassan
	 * @date  22/02/2024
	 */
	
	 public class paypal {
		
		 	public static void main(String[] args ) {
		 		
		 	final float MONTANT_MIN= (float)0.37 ;
		 	final float FRAISFIXE = (float)0.35;
		 		float montant, commission;
		 		
		Scanner lireClavier = new Scanner(System.in);
		
		System.out.println("entre le montant de la vente:");
		montant = lireClavier.nextFloat();
		commission = 0.35f + montant * 0.034f ;
		
		if (montant >= 0 ) {
		commission = 0.35f + montant * 0.034f ;
		System.out.println("la commission paypal est de :" + commission);
		System.out.println("le vendeur va recevoir:" +( montant - commission));
		}
		else {
			System.out.println("il fonctionne pas");
		}
	
	
	
	

      } // fin main
}// fin program