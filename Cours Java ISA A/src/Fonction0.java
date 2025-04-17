
public class Fonction0 {

	public static void main(String[] args) {
		
	int longueur, largeur;
	longueur = 20;
	largeur = 10;
	
	calculerSurface(longueur, largeur);

	
	calculerSurface(30, 15);

	
	System.out.println("Terminé");

	}// fin main
	
	public static void calculerSurface(int longueur, int largeur) {
		int surface;
		surface = largeur * longueur;
		System.out.println("la surface est de : " + surface);
	}// fin fonction

}// fin programme
