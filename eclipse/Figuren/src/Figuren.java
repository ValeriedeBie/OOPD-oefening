import processing.core.PApplet;

public class Figuren extends PApplet{

	public static void main(String[] args) {
		PApplet.main(new String[] { "Figuren" });

	}
	
	private Vorm c;
	private Vorm r;
	
	public void settings() {
		size(500,500);
	}
	
	public void setup() {
		background(0);
		c = new Cirkel(40, 40, 60);
		c.setSnelheid(1, 1);
		c.setVersnelling(1, 1);
		r = new Rechthoek(140,320,80,140);
		r.setSnelheid(-1, -1);
		r.setVersnelling(-1, -1);
	}

	public void draw() {
		background(0);
		c.setKleur(255);
		c.teken(this);
		c.doeStap();
		r.setKleur(255);
		r.teken(this);
		r.doeStap();
	}
}