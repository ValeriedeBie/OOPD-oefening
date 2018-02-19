class Slider {
  float x, y, breedte, hoogte; 
  int nPosities, positie;

  Slider() {
    this.breedte = 200;
    this.hoogte = 50;
    this.x = (width - breedte) / 2;
    this.y = 50;
    this.nPosities = 5;
  }
  
  //Slider(float breedte, float hoogte, float x, float y, int nPosities){
  //  this.breedte = breedte;
  //  this.hoogte = hoogte;
  //  this.x = x;
  //  this.y = y;
  //  this.nPosities = nPosities;
  //}

  void tekenSlider() {
    float blokjeBreedte = breedte / nPosities;
    noStroke();
    fill(255);
    rect(x, y, breedte, hoogte);
    fill(#2257F0);
    rect(x + positie * blokjeBreedte, y, blokjeBreedte, hoogte);
  }

  void bepaalSliderPositie() {
    float blokjeBreedte = breedte / nPosities;
    if (mouseX < x) {
      positie = 0;
    } else if (mouseX >= breedte + x) {
      positie = nPosities - 1;
    } else {
      positie = floor((mouseX  - x) / blokjeBreedte);
    }
  }
  
  String toString(){
    return "De positie van de slider is: " + positie;
  }
}