import java.util.ArrayList;

public class Main {	
	public static void main(String[] args) {
		ArrayList<String> lijst = new ArrayList<String>();
		
		for (int i = 0; i < 4; i++) {
			lijst.add("element: " + i);
		}
		
		for (int i = 0; i < lijst.size(); i++) {
			String s = lijst.get(i);
			lijst.remove(s);
		}
		
		for (String element : lijst) {
			System.out.println(element);
		}
	
/* Opgave A
 * Als je iets probeert te verwijderen met een for loop verplaatst de locatie. 0 wordt verwijderd,
 * alles schuift een plek op dus 0 wordt 1 en 1 wordt 2. 2 (locatie van 1) wordt verwijderd maar 1
 * blijft staan.
 * 
 * Opgave B
 * Alles wat buiten het scherm valt wordt verwijderd door middel van een boolean.
 */
		System.out.println("---------------");
		
		for (int i = 0; i < 4; i++) {
			lijst.add("element: " + i);
		}
		
		while (lijst.size() > 0) {
			lijst.remove(0);
		}
		
		for (String element : lijst) {
			System.out.println(element);
		}
	}
}