import processing.core.PApplet;

public class Rechthoek extends Vorm{
	
	public Rechthoek(float x, float y, float breedte, float hoogte) {
		super(x, y, breedte, hoogte);
	}
		
	public void teken(PApplet p) {
		p.noStroke();
		p.fill(kleur);
		p.rect(x, y, breedte, hoogte);
	}
}
