public class Klok {
	  private Teller minutenTeller, urenTeller;

	  
	  public Klok(float x, float y, float breedte){    
	    urenTeller = new Teller(24,x,y,breedte/2);
	    minutenTeller = new Teller(60,x + breedte/2, y, breedte / 2);
	  }
	  
	  
	  
	  public void tik(){
	    minutenTeller.tik();
	    if(minutenTeller.getWaarde() == 0){
	      urenTeller.tik();
	    }
	  }
	  
	  public void setTijd(int uren, int minuten){
	    minutenTeller.setWaarde(58);
	    urenTeller.setWaarde(23);
	  }
	  
	  public void tekenKlok(KlokApp app) {
	    urenTeller.tekenTeller(app);
	    minutenTeller.tekenTeller(app);
	  }

	  public float getX() {
		  return urenTeller.getX();
	  }
	  
	  public void setX(float x) {
		  urenTeller.setX(x);
		  minutenTeller.setX(x + urenTeller.getBreedte());
	  }
	  
	  public float getY() {
		  return urenTeller.getY();
	  }
	  
	  public void setY(float y) {
		  urenTeller.setY(y);
		  minutenTeller.setY(y + urenTeller.getBreedte());
	  }
	  
	  public float getHoogte() {
		  return urenTeller.getHoogte();
	  }
	  
	  public float getBreedte() {
		  return urenTeller.getBreedte();
	  }

	  public void setHoogte(float hoogte) {
		  urenTeller.setHoogte(hoogte);
		  minutenTeller.setHoogte(hoogte);
	  }
	  
	  public void setBreedte(float breedte) {
		  urenTeller.setBreedte(breedte/2);
		  minutenTeller.setBreedte(breedte/2);
		  
	  }
}

