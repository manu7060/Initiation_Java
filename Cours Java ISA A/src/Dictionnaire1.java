import java.util.HashMap;

public class Dictionnaire1 {

	public static void main(String[] args) {
		String couleur1 = "rouge";
		HashMap<String, Integer> codeCouleur = new HashMap<String, Integer>();
		
		codeCouleur.put("noir", 0);
		codeCouleur.put("brun", 1);
		codeCouleur.put("rouge", 2);
		codeCouleur.put("orange", 3);
		codeCouleur.put("jaune", 4);
		codeCouleur.put("vert", 5);
		codeCouleur.put("bleu", 6);
		codeCouleur.put("violet", 7);
		codeCouleur.put("gris", 8);
		codeCouleur.put("blanc", 9);
		
		// lister le dictionnaire
		System.out.println(codeCouleur);
		
		System.out.println(codeCouleur.get(couleur1));
		System.out.println("Il y a " + codeCouleur.size() + " éléments dans ce dictionnaire.");
	}// fin main
}// fin programme