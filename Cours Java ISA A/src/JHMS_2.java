
public class JHMS_2 {

	public static void main(String[] args) throws InterruptedException {

		long nbMilliSecondes_debut = System.currentTimeMillis();
		
		
		Thread.sleep(1000);
		
		
		long nbMilliSecondes_fin = System.currentTimeMillis();
		
		System.out.println("Terminé " + (nbMilliSecondes_fin - nbMilliSecondes_debut));

	}

}