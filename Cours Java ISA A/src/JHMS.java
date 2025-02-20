import java.util.Scanner;

public class JHMS {

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner (System.in);
		int nbSecondes, reste;
		int jour, heure, minute, seconde;
		
		//Demander le nombre de secondes
		System.out.print("Entrez le nombre de secondes : ");
		nbSecondes = lireClavier.nextInt();

		while (nbSecondes > 0) {
			jour = nbSecondes / 86400;  //Le nombre de jours entiers correspond au nombre de fois qu'il y a 86400 secondes
			reste = nbSecondes - (jour * 86400);
			
			heure = reste / 3600;
			reste = reste - (heure * 3600);
			
			minute = reste / 60;
			reste = reste - (minute * 60);
			
			seconde = reste; // le nombre de seconde qui restent correspond au reste !
			
			System.out.println("Le nombre de " + nbSecondes + " correspond à " + jour + " jours, " + heure + " heures, " + minute + " minutes et " + seconde + " secondes.");

			//Demander le nombre de secondes
			System.out.print("Entrez le nombre de secondes : ");
			nbSecondes = lireClavier.nextInt();
		
		}// fin while
		
		System.out.println("Terminé");
	}// fin main
}// fin programme