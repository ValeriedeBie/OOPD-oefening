
public abstract class Figuur extends WeergaveObject{
	protected int vulKleur;
	
	Figuur(float x, float y, float breedte, float hoogte, int vulKleur){
		super(x,y, breedte, hoogte);
		this.vulKleur = vulKleur;
	}

	public int getVulKleur() {
		return vulKleur;
	}

	public void setVulKleur(int vulKleur) {
		this.vulKleur = vulKleur;
	}
	
}
