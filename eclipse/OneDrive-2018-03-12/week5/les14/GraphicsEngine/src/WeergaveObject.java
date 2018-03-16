import processing.core.PApplet;

public abstract class WeergaveObject {
	protected float x, y, vx, vy, ax, ay;
	protected float breedte, hoogte;
	protected boolean isZichtbaar;

	
	public void doeStap() {
		
	}
	
	public abstract void geefWeer(PApplet app, float startX, float startY);

	protected abstract boolean isMuisBinnen(int muisX, int muisY);

	protected void behandelMousePressedGebeurtenis() {

	}

	public void voegReageerderToe(IReageerder reageerder) {

	}

	public void verwijderReageerderToe(IReageerder reageerder) {

	}

}
