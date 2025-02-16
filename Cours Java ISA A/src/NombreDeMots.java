import java.util.Scanner;

public class NombreDeMots {

	public static void main(String[] args) {
		Scanner lectureClavier = new Scanner(System.in);
		String phrase;
		int mot = 0; 				// nombre de mots
		boolean status = false; 	// Status = true quand on est dans le mot et false quand on est entre 2 mots

		System.out.print("Entrez une phrase, je vais compter le nombre de mots : ");
		phrase = lectureClavier.nextLine();
		for(int i=0; i<phrase.length(); ++i){
			if (phrase.charAt(i) == ' '){
				status = false;
			}
			else if (!status) {
				++mot;
				status = true;
			}
		} // fin for
		System.out.println("Nombre de mots dans la phrase : " + mot);
		lectureClavier.close();
	}//fin main

}
