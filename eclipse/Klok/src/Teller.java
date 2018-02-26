public class Teller {
	private int waarde;
	private int maximum;
	private float x, y, breedte, hoogte;
	//private KlokApp app;
	
	public Teller(int maximum, float x, float y, float breedte) {
		this.maximum = maximum;
		waarde = 0;
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.hoogte = breedte * 0.8f;
		//app = p;
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
	
	public void tekenTeller(KlokApp app) {
		app.noStroke();
		app.fill(0);
		
		app.rectMode(app.CENTER);
		app.rect(x, y, breedte, hoogte);

		app.fill(255, 0, 0);
		app.textSize(hoogte);
		
		app.textAlign(app.CENTER);
		float tijdBreedte = app.textWidth(getTijdNotatie());
		float verschuiving = (app.textAscent() - app.textDescent()) /2;
		app.text(getTijdNotatie(), x, y + verschuiving);
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

	

}
