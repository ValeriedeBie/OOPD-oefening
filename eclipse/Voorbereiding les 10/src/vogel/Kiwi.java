package vogel;

public class Kiwi extends Dier{
private int loopSnelheid;
	
	public Kiwi(String naam, int loopSnelheid) {
		super(naam);
		this.loopSnelheid = loopSnelheid; 
	}

}

/* Opgave B
 * Doordat je extends Dier hebt weet het programma dat de super bedoelt is voor Dier.
 * Opgave C
 * Je moet een super toevoegen want nu snapt je programma niet waar String naam vandaan komt.
 * Opgave D
 * Je mag de regels niet omdraaien.
 */