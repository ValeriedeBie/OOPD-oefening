import processing.core.PApplet;

public abstract class Vorm {
	protected float x, y, vx, vy, ax, ay;
	protected float breedte, hoogte;
	protected int kleur;

	public Vorm(float x, float y, float breedte, float hoogte) {
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.hoogte = hoogte;
		zetStil();
		kleur = 0xFFFFFFFF;
	}

	public void doeStap() {
		if (!staatStil()) {
			pasVersnellingToe();
			pasSnelheidToe();
		}
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

	public void setKleur(int kleur) {
		this.kleur = kleur;
	}

	private void pasVersnellingToe() {
		vx += ax;
		vy += ay;
	}

	private void pasSnelheidToe() {
		x += vx;
		y += vy;
	}

	protected abstract void teken(PApplet p);

	public boolean isMuisBinnen(int mouseX, int mouseY) {
		if (mouseX >= x && mouseX < x + breedte && mouseY >= y && mouseY < y + hoogte) {
			return true;
		} else {
			return false;
		}
	}
}
