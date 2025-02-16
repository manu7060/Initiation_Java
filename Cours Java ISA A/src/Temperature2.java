import java.util.Scanner;
public class Temperature2 {

	public static void main(String[] args) {

		// Déclaration des variables
		char unite;
		Float temperatureC, temperatureF;	
		Scanner lireClavier = new Scanner(System.in);
		
		System.out.print("Entre l'unité désirée : ");
		unite = lireClavier.next().charAt(0);
		lireClavier.nextLine();  // cette instruction vide le buffer du clavier
		// l'instruction switch() fonctionne avec le type char
		switch(unite) {
		case 'c':
		case 'C':
			//instructions pour convertir en degrés Celcius
			System.out.print("Entrez la température : ");
			temperatureF = lireClavier.nextFloat();
			if (temperatureF >= -459.67) {
				temperatureC = (5f/9f)*(temperatureF-32);
				System.out.format("La température est de : %.2f degrés Celcius", temperatureC);
			}
			else
				System.out.println("Erreur de température");
			break;
		case 'f':
		case 'F':
			// instructions pour convertir en degrés F
			System.out.print("Entrez la température : ");
			temperatureC = lireClavier.nextFloat();
			if (temperatureC >= -273.15) {
				temperatureF = (temperatureC*(9f/5f))+32;
				System.out.format("La température est de : %.2f degrés Farenheit", temperatureF);
			}
			else
				System.out.println("Erreur de températue");
			break;
		default:
			System.out.println("Erreur d'unité");
		} // fin switch
		lireClavier.close();
		
		
	}

}
