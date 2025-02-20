import java.util.Scanner;

public class JHMS_Milli {

	public static void main(String[] args) throws InterruptedException {
		Scanner lireClavier = new Scanner (System.in);
		long nbMilliSeconde, nbSecondes, reste;
		int jour, heure, minute, seconde;
		
		//Demander le nombre de millisecondes
		System.out.print("Entrez le nombre de millisecondes : ");
		nbMilliSeconde = lireClavier.nextInt();
		nbSecondes = (int)(nbMilliSeconde / 1000);

		while (nbSecondes > 0) {
			jour = (int)(nbSecondes / 86400);  //Le nombre de jours entiers correspond au nombre de fois qu'il y a 86400 secondes
			reste = nbSecondes - (jour * 86400);
			
			heure = (int)(reste / 3600);
			reste = reste - (heure * 3600);
			
			minute = (int)(reste / 60);
			reste = reste - (minute * 60);
			
			seconde = (int)reste; // le nombre de seconde qui restent correspond au reste !
			
			System.out.println("Le nombre de " + nbSecondes + " correspond à " + jour + " jours, " + heure + " heures, " + minute + " minutes et " + seconde + " secondes.");

			//Demander le nombre de secondes
			Thread.sleep(1000); // instruction pour faire une pause de x millisecondes
			System.out.print("Entrez le nombre de secondes : ");
			nbSecondes = lireClavier.nextInt();
		
		}// fin while
		
		System.out.println("Terminé");
	}// fin main
}// fin programme