import processing.core.PApplet;

public class Rechthoek extends Figuur{
	
	public Rechthoek(float x, float y, float breedte, float hoogte, int kleur) {
		super(x,y, breedte, hoogte, kleur);
		// TODO Auto-generated constructor stub
	}

	public void geefWeer(PApplet app, float startX, float startY) {
		app.rect(x,y,breedte,hoogte);
	}
	
	public boolean isMuisBinnen(int muisX, int muisY) {
		if (muisX >= x && muisX < x + breedte && muisY >= y && muisY < y + hoogte) {
			return true;
		} else {
			return false;
		}
	}
}
