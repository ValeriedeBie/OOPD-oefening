public class Klok {
	  private Teller minutenTeller;
	  private Teller urenTeller;
	  
	  public Klok(float x, float y, float breedte, float hoogte){    
	    urenTeller = new Teller(null, 24,x,y,breedte/2,hoogte);
	    minutenTeller = new Teller(null,60,x + breedte/2, y, breedte / 2, hoogte);
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
	  
	  public void tekenKlok(){
	    urenTeller.tekenTeller();
	    minutenTeller.tekenTeller();
	  }
}

