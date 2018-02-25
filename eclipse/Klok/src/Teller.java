public class Teller {
	private int waarde;
	private int maximum;
	private float x, y, breedte, hoogte;
	private KlokApp app;
	
	public Teller(KlokApp p, int maximum, float x, float y, float breedte, float hoogte) {
		this.maximum = maximum;
		waarde = 0;
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.hoogte = hoogte;
		app = p;
	}

	public void tik() {
		waarde = (waarde + 1) % maximum;
	}

	public String getTijdNotatie() {
		if (waarde < 10) {
			return "0" + waarde;
		} else {
			return "" + waarde;
		}
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getBreedte() {
		return breedte;
	}

	public void setBreedte(float breedte) {
		this.breedte = breedte;
	}

	public float getHoogte() {
		return hoogte;
	}

	public void setHoogte(float hoogte) {
		this.hoogte = hoogte;
	}

	public int getWaarde() {
		return waarde;
	}

	public void setWaarde(int waarde) {
		if (waarde >= 0 && waarde < maximum) {
			this.waarde = waarde;
		}
	}

	public void tekenTeller() {
		app.noStroke();
		app.fill(0);
		
		app.rectMode(app.CORNER);
		app.rect(x, y, breedte, hoogte);

		app.fill(255, 0, 0);
		app.textSize(hoogte);
		
		app.textAlign(app.LEFT);
		float tijdBreedte = app.textWidth(getTijdNotatie());
		float verschuivingX = (getBreedte() - tijdBreedte) / 2;
		float verschuivingY = app.textAscent() - app.textDescent() / 2;
		app.text(getTijdNotatie(), x + verschuivingX, y + verschuivingY);
	}

}
