class Klok {
  float x, y, breedte;
  int uren, minuten;
  
  Klok(float x, float y, float breedte, int uren, int minuten) {
    this.x = x;
    this.y = y;
    this.breedte = breedte;
    this.uren = uren;
    this.minuten = minuten;
  }
  
  void tekenKlok(){
    rectMode(CENTER);
    rect(x,y,breedte,breedte);
    fill(0);
    textSize(75);
    textAlign(CENTER, CENTER);
    text(uren + ":" + minuten, x, y);
  }
  
  String toString(){
    return "Het is nu " + uren + ":" + minuten;
  }
}