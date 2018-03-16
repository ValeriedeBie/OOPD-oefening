import java.util.ArrayList;

import processing.core.PApplet;

public abstract class WeergaveObject {
	protected float x, y, vx, vy, ax, ay, breedte, hoogte;
	protected boolean isZichtbaar;
	ArrayList<IReageerder> reageerdersLijst = new ArrayList<IReageerder>();

	public WeergaveObject(float x, float y, float breedte, float hoogte) {
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.hoogte = hoogte;
	}
	//TODO WeergaveObjectContainer maken
	//Deze klasse kan meerdere instanties van Weergave Object bevatten. 
	//Een WeergaveObjectContainer heeft zelf een breedte en een hoogte van 0.
	
	public void doeStap() {
		if (!staatStil()) {
			pasVersnellingToe();
			pasSnelheidToe();
		}
	}
	private void pasVersnellingToe() {
		vx += ax;
		vy += ay;
	}

	private void pasSnelheidToe() {
		x += vx;
		y += vy;
	}

	public void setSnelheid(float vx, float vy) {
		this.vx = vx;
		this.vy = vy;
	}

	public void setVersnelling(float ax, float ay) {
		this.ax = ax;
		this.ay = ay;
	}

	public void zetStil() {
		vx = vy = ax = ay = 0;
	}

	public boolean staatStil() {
		return (vx == 0 && vy == 0 && ax == 0 && ay == 0);
	}
	public abstract void geefWeer(PApplet app, float startX, float startY);

	public void geefMousePressedGebeurtenis(int mouseX, int mouseY) {
		if (isMuisBinnen(mouseX, mouseY)) {
			for (IReageerder rg : reageerdersLijst) {
				rg.doeActie(this);
			}
		}
	}

	protected abstract boolean isMuisBinnen(int muisX, int muisY);

	public void behandelMousePressedGebeurtenis() {

	}
	
	public void voegReageerderToe(IReageerder reageerder) {
		reageerdersLijst.add(reageerder);
	}
	
	public void verwijderReageerder(IReageerder reageerder) {
		reageerdersLijst.remove(reageerder);
	}
}
