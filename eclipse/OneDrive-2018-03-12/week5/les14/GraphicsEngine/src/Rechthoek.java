import processing.core.PApplet;

public class Rechthoek extends Figuur{

	public void geefWeer(PApplet app) {
		
	}

	public boolean isMuisBinnen(int muisX, int muisY) {
		if (muisX >= x && muisX < x + breedte && muisY >= y && muisY < y + hoogte) {
			return true;
		} else {
			return false;
		}
	}

	
}
