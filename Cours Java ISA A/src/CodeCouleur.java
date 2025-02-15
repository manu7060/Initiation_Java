public class CodeCouleur {

	public static void main(String[] args) {
		
		Resistance resistance = new Resistance();
		
		resistance.couleur1 = "rouge";

		System.out.println(resistance.couleur1);

	
	}
	
/***
 * Classe résistance	
 */
	public static class Resistance {
		public String couleur1;
		public String couleur2;
		public int valeur;
		public float tolerance;
	}
}
