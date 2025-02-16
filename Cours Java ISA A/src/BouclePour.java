/***
 * Calculs de la puissance dissipée d'une résistance
 */
public class BouclePour {

	public static void main(String[] args) {

		float u, p, r;
		r = 1000f;

		System.out.println("Afficher la puissance pour une résistance de " + r + " Ohms");
		for (int i=6; i<=20; ++i) {
			u = (float)i;
			p = (u * u) / r;
			System.out.println("La puissance pour " + u + " V : " + p + " W");
		}// fin-for

		System.out.println("Terminé");

	}
}