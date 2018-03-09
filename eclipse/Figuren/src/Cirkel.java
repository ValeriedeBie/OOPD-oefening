import processing.core.PApplet;

public class Cirkel extends Vorm{
	
	public Cirkel(float x, float y, float diameter) {
		super(x,y,diameter, diameter);
	}
		
	public void teken(PApplet p) {
		p.noStroke();
		p.fill(kleur);
		p.ellipse(x, y, breedte, hoogte);
	}
}
