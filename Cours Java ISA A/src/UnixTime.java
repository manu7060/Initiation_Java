import java.time.*;

public class UnixTime {

	public static void main(String[] args) throws InterruptedException {
		
		long unixTimeMillis = System.currentTimeMillis();
        System.out.println("Temps Unix en millisecondes : " + unixTimeMillis);
        
        Thread.sleep(1000);

		unixTimeMillis = System.currentTimeMillis();
        System.out.println("Temps Unix en millisecondes : " + unixTimeMillis);
        
        LocalDate date = LocalDate.of(1964, 10, 12);
        DayOfWeek jour = date.getDayOfWeek();
        System.out.println("Le 1er janvier 1970 était un : " + jour);


	}
}