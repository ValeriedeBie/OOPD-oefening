import processing.core.PApplet;

public class KlokApp extends PApplet {
	public static void main(String[] args) {
		PApplet.main(new String[] { "KlokApp" });
	}

	Klok deKlok;
	
	public void settings() {
		size(400, 300);
	}

	public void setup() {
		
		deKlok = new Klok(150, 100, 200);
		deKlok.setTijd(11,59);
	}
	
	public void draw() {
		background(255);
		deKlok.tik();
		deKlok.tekenKlok(this);
	}
}
