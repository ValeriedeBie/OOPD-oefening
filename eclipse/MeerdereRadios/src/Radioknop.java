import processing.core.PApplet;

public class Radioknop extends Switch implements IDoelwit {

	private PApplet app;
	private int kleur;

	public Radioknop(PApplet app, float x, float y, float breedte, float hoogte) {
		super(app, x, y, breedte, hoogte);
		this.app = app;
		kleur = 255;
	}

	public void tekenKnop() {
		app.ellipseMode(PApplet.CENTER);
		app.noStroke();
		app.fill(255);
		app.ellipse(x, y, breedte, hoogte);
		if (isAan) {
			app.fill(0);
			app.ellipse(x, y, breedte - breedte / 4, hoogte - hoogte / 4);
		}
	}

	public boolean isMuisOverKnop() {
		if (PApplet.dist(app.mouseX, app.mouseY, x, y) < breedte / 2) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public void schakel() {
		doeKnopActie();
		for(IDoelwit dw: doelWitten) {
			Radioknop rk = (Radioknop) dw;
			rk.isAan = false;
		}
		this.isAan = true;
	}
	@Override
	public void handelInteractieAf() {
		isAan = !isAan;
		schakel();
	}

	public void teken() {
		app.fill(kleur);
	}

}
