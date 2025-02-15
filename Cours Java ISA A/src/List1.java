import java.util.ArrayList;
import java.util.Collections;

public class List1 {

	public static void main(String[] args) {
		ArrayList liste = new ArrayList();
		
		for (int i=0; i<20; ++i) {
			liste.add((int)(Math.random() * 100));
		}

		System.out.println(liste.toString());
		
		//liste.sort(null);
		Collections.sort(liste);
		System.out.println(liste.toString());
		System.out.println("::" + liste);
		
		Collections.reverse(liste);
		System.out.println(liste.toString());

		liste.set(0, 88);
		liste.set(2, 88);
		liste.set(4, 88);
		System.out.println(liste.toString());
		
		
		System.out.println(liste.indexOf(88));
		System.out.println(liste.lastIndexOf(88));
		System.out.println(liste.lastIndexOf(88));
	} // fin main

} // fin programme