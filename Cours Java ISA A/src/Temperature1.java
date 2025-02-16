import java.util.Scanner;

public class Temperature1 {

	public static void main(String[] args) {
		
		Scanner LireClavier = new Scanner (System.in);
		float temperatureC, temperatureF;
		char choix;  // le choix de l'unité de température
		
		System.out.print("Entrez l'unité de température : ");
		choix = LireClavier.next().charAt(0);
		//LireClavier.nextLine();
		if (choix == 'C' || choix == 'c') {
			// Demander la température
			System.out.print("Entrez la température en degrés C : ");
			temperatureC = LireClavier.nextFloat();
			
			// calculer la température en degrés F
			temperatureF = (5f/9f)*(temperatureC-32f);
			
			// Afficher le résultat
			System.out.println("La température en degré Farenheit : " + temperatureF);
		}
		else if (choix == 'F' || choix == 'f') {
			// Demander la température
			System.out.print("Entrez la température en degrés F : ");
			temperatureF = LireClavier.nextFloat();
			
			// calculer la température en degrés F
			temperatureC = temperatureF * (9f/5f) + 32;
			
			// Afficher le résultat
			System.out.println("La température en degré Celius : " + temperatureC);
		}
		else
			System.out.println("Vous n'avez pas entré la bonne unité");

	}
}