class Teller {
  int waarde;
  int maximum;
  float x, y, breedte, hoogte;

  Teller(int maximum, float x, float y, float breedte) {
    this.maximum = maximum;
    waarde = 0;
    this.x = x;
    this.y = y;
    this.breedte = breedte;
    this.hoogte = breedte * 0.4;
  }

  void tik() {
    waarde = (waarde + 1) % maximum;
  }

  String geefTijdNotatie() {
    if (waarde < 10) {
      return "0" + str(waarde);
    } else {
      return str(waarde);
    }
  }

  void tekenTeller() {
    rectMode(CENTER);
    noStroke();
    fill(0);
    rect(x, y, breedte, hoogte);

    fill(255, 0, 0);
    textSize(hoogte);
    textAlign(CENTER);
    float verschuiving = (textAscent() - textDescent())/2;
    text(geefTijdNotatie(), x, y + verschuiving);
  }
}