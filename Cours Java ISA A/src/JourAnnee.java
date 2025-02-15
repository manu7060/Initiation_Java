import java.util.Scanner;

public class JourAnnee {

	public static void main(String[] args) {
		int jour, mois, annee, nombreDeJours;
		Scanner lireClavier = new Scanner(System.in);
		
		System.out.print("Entrez le jour : ");
		jour = lireClavier.nextInt();
		System.out.print("Entrez le mois : ");
		mois = lireClavier.nextInt();
		System.out.print("Entrez l'annee : ");
		annee = lireClavier.nextInt();
		nombreDeJours = NombreDeJoursAnnee (jour, mois, annee); 
		System.out.println("Le nombre de jours depuis le début de l'année : " + nombreDeJours);
		nombreDeJours += NombreDeJoursDepuis2000 (annee);
		System.out.println("Le Nombre de jours depuis l'année 2000 : " + nombreDeJours);
		System.out.println("Le jour de la semaine est : " + JourDeLaSemaine(nombreDeJours));
		lireClavier.close();
	} // fin main

	public static String JourDeLaSemaine (int nombreDeJours) {
		String jourSemaine;
		String [] jour = {"samedi", "dimanche", "lundi", "mardi", "mercredi", "jeudi", "vendredi"};
		jourSemaine = jour[ (nombreDeJours-1) % 7 ];
		return (jourSemaine);
	}

	public static int NombreDeJoursDepuis2000 (int annee) {
		int nombreDeJours2000;
		if (annee > 2000) {
			// ajouter le nombre de jours d'années entières
			nombreDeJours2000  = (annee-2000) * 365;
			// ajouter 1 car l'année 2000 est bissextile
			++nombreDeJours2000;
			// ajouter un jour pour toutes les années bissextiles entre 2000 et annee
			nombreDeJours2000 += (annee-2000-1)/4;
		}
		else
			// Pour tenir compte que si annee == 2000, il ne faut pas ajouter de jours, car il n'y a pas d'année entière
			nombreDeJours2000 = 0;
		return (nombreDeJours2000);
	} // fin fonction

	public static int NombreDeJoursAnnee (int jour, int mois, int annee) {
		int nombreJours = jour;
		switch (mois) {
		case 1:
			break;
		case 2:
			nombreJours += 31; break;
		case 3:
			nombreJours += 31+28; break;
		case 4:
			nombreJours += 31+28+31; break;
		case 5:
			nombreJours += 31+28+31+30; break;
		case 6:
			nombreJours += 31+28+31+30+31; break;
		case 7:
			nombreJours += 31+28+31+30+31+30; break;
		case 8:
			nombreJours += 31+28+31+30+31+30+31; break;
		case 9:
			nombreJours += 31+28+31+30+31+30+31+31; break;
		case 10:
			nombreJours += 31+28+31+30+31+30+31+31+30; break;
		case 11:
			nombreJours += 31+28+31+30+31+30+31+31+30+31; break;
		case 12:
			nombreJours += 31+28+31+30+31+30+31+31+30+31+30; break;
		} // fin switch
		if ( (mois > 2) && (IsBissextile(annee) ) )
			nombreJours++;
		return (nombreJours);
	} // fin fonction

	public static Boolean IsBissextile (int annee) {
		return ( (annee % 4 == 0 && annee % 100 != 0) ||  annee % 400 == 0 );
	}
} // fin programme
