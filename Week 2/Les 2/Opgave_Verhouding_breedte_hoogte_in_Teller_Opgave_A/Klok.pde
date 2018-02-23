class Klok {
  Teller minutenTeller;
  Teller urenTeller;
  float x, y, hoogte, breedte;
  
  Klok(float x, float y, float breedte){
    this.x = x;
    this.y = y;
    this.breedte = breedte;
    urenTeller = new Teller(24,x,y,breedte/2);
    minutenTeller = new Teller(60,x + breedte/2, y, breedte / 2);
  }
  
  void tik(){
    minutenTeller.tik();
    if(minutenTeller.waarde == 0){
      urenTeller.tik();
    }
  }
  
  void setTijd(int uren, int minuten){
    minutenTeller.waarde = 58;
    urenTeller.waarde = 23;
  }
  
  void tekenKlok(){
    urenTeller.tekenTeller();
    minutenTeller.tekenTeller();
  }
}