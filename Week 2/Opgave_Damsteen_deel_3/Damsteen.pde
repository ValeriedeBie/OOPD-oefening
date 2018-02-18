boolean isGeselecteerd = false;

class Damsteen {
  int x, y, diameter, kleur;

  Damsteen (int x, int y, int diameter, int kleur) {
    this.x = x;
    this.y = y;
    this.diameter = diameter;
    this.kleur = kleur;
  }

  void tekenDamsteen() {
    for (int i = 0; i<stenen.length; i++) {
      fill(kleur);
      if (isGeselecteerd) {
        strokeWeight(4);
        stroke(#389632);
      }
      ellipse(x, y, diameter, diameter);
    }
  }

  void isGeselecteerd() {
    if (mouseX >= x && mouseX < x + diameter &&
      mouseY >= y && mouseY < y + diameter) {
      isGeselecteerd = true;
    } else {
      isGeselecteerd = false;
    }
    println(isGeselecteerd);
  }
}