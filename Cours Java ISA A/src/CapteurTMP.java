import java.util.Scanner;

/***
 * Programme de calcul des capteurs analogiques de température
 * @author E. Dauvin
 * @version 1
 */
public class CapteurTMP {

	public static void main(String[] args) {
		Scanner lireClavier = new Scanner(System.in);
		float valeurIN[] = new float[5];
		float valeurOUT[] = new float[5];
		int typeCapteur;
		
		System.out.println("Entrez le type de capteur");
		System.out.println(" 1:TMP35");
		System.out.println(" 2:TMP36");
		System.out.println(" 3:TMP37");
		System.out.print(" : ");
		typeCapteur = lireClavier.nextInt();

		

	}// fin main

	
	public static void calculerTemperature(float valeurIN, int typeCapteur) {
		
	}// fin fonction
}// fin programme