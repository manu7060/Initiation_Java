import java.util.Scanner;

public class JourAnnee {

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner(System.in);
		int jour, mois, annee;
		int nbJourAnnee;// = 0, nbJourTotal, jourSemaine;
		// Ici, j'utilise un tableau pour afficher plus facilement le jour de la semaine
		String [] tabJour = {"samedi", "dimanche", "lundi", "mardi", "mercredi", "jeudi", "vendredi"};

		// Commencer par demander à l'utilisateur d'entrer les données
		System.out.print("Entrez le jour : ");
		jour = lireClavier.nextInt();
		System.out.print("Entrez le mois : ");
		mois = lireClavier.nextInt();
		System.out.print("Entrez l'année : ");
		annee = lireClavier.nextInt();
		
		// Compter le nombre de jour depuis le début de l'année
		nbJourAnnee = jour;
		switch (mois) {
		case 2:
			nbJourAnnee += 31;
			break;
		case 3:
			nbJourAnnee += 31+28;
			break;
		case 4:
			nbJourAnnee += 31+28+31;
			break;
		case 5:
			nbJourAnnee += 31+28+31+30;
			break;
		case 6:
			nbJourAnnee += 31+28+31+30+31;
			break;
		case 7:
			nbJourAnnee += 31+28+31+30+31+30;
			break;
		case 8:
			nbJourAnnee += 31+28+31+30+31+30+31;
			break;
		case 9:
			nbJourAnnee += 31+28+31+30+31+30+31+31;
			break;
		case 10:
			nbJourAnnee += 31+28+31+30+31+30+31+31+30;
			break;
		case 11:
			nbJourAnnee += 31+28+31+30+31+30+31+31+30+31;
			break;
		case 12:
			nbJourAnnee += 31+28+31+30+31+30+31+31+30+31+30;
			break;
		default:
			break;
		}
		// Ajouter 1 jour si l'année est bissextile
		if ((mois > 2) && (((annee % 4 == 0) && (annee % 100 != 0)) || (annee % 400 == 0))) {
				nbJourAnnee += 1;
				System.out.println("C'est une année bissextile");
		}// fin-if
		System.out.println("Depuis le début de l'année, il y a : " + nbJourAnnee + " jours");

		if (annee > 2000) {
			// ajouter le nombre de jours d'années entières
			nbJourAnnee  += (annee-2000) * 365;
			// ajouter 1 jour, car l'année 2000 est bissextile
			++nbJourAnnee;
			// ajouter un jour pour toutes les années bissextiles entre 2000 et annee
			// On fait -1 , car les jours de l'année en cours sont déjà comptés
			nbJourAnnee += (annee-1-2000)/4;
		}
		System.out.println("Le Nombre de jours depuis l'année 2000 : " + nbJourAnnee);
		
		
		// Afficher le jour de la semaine avec le tableau
		System.out.println("Le jour de la semaine est : " + (tabJour[ (nbJourAnnee-1) % 7 ]));
		
	}// fin main
}// fin programme