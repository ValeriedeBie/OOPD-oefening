class Slider {
  float x, y, breedte, hoogte; 
  int nPosities;

  Slider() {
    this.breedte = 200;
    this.hoogte = 50;
    this.x = (width - breedte) / 2;
    this.y = 50;
    this.nPosities = 5;
  }

  void tekenSlider() {
    float blokjeBreedte = breedte / nPosities;
    noStroke();
    fill(255);
    rect(x, y, breedte, hoogte);
    fill(#2257F0);
    rect(x + positie * blokjeBreedte, y, blokjeBreedte, hoogte);
  }

  int bepaalSliderPositie() {
    float blokjeBreedte = breedte / nPosities;
    if (mouseX < x) {
      return 0;
    } else if (mouseX >= breedte + x) {
      return nPosities - 1;
    } else {
      return floor((mouseX  - x) / blokjeBreedte);
    }
  }
}