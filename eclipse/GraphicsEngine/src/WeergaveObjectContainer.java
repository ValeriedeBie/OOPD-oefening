import java.util.ArrayList;

import processing.core.PApplet;

public class WeergaveObjectContainer extends WeergaveObject {

	ArrayList<WeergaveObject> weergaveObjecten = new ArrayList<WeergaveObject>();

	public WeergaveObjectContainer(float x, float y) {
		super(x, y, 0, 0);
	}

	@Override
	public void geefWeer(PApplet app, float startX, float startY) {
		for (WeergaveObject wo : weergaveObjecten) {
			wo.geefWeer(app, 0, 0);
		}
	}

	public void doeStap() {
		for (WeergaveObject wo : weergaveObjecten) {
			wo.doeStap();
		}
	}

	public void voegWeergaveObjectToe(WeergaveObject object) {
		weergaveObjecten.add(object);
	}

	public void verwijderWeergaveObject(WeergaveObject object) {
		weergaveObjecten.remove(object);
	}

	@Override
	public boolean isMuisBinnen(int muisX, int muisY) {
		if (muisX >= x && muisX < x + breedte && muisY >= y && muisY < y + hoogte) {
			return true;
		} else {
			return false;
		}
	}

	public void geefMousePressedGebeurtenis(int mouseX, int mouseY) {
		for (WeergaveObject wo : weergaveObjecten) {
			wo.geefMousePressedGebeurtenis(mouseX, mouseY);
		}
	}
}
