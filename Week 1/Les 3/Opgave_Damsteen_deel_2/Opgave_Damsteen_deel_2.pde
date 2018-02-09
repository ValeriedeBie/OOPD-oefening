Damsteen eenDamsteenWit = new Damsteen(30, 40, 50, 255);
Damsteen eenDamsteenWit1 = new Damsteen(90, 40, 50, 255);
Damsteen eenDamsteenZwart = new Damsteen(30, 340, 50, 0);
Damsteen eenDamsteenZwart1 = new Damsteen(90, 340, 50, 0);
Damsteen[] damsteenInformatie = {eenDamsteenWit, eenDamsteenWit1, eenDamsteenZwart, eenDamsteenZwart1};

void setup() {
  size(500, 500);
}

void draw() {
  background(#A02323);
  tekenDamsteen(damsteenInformatie);
}

void tekenDamsteen(Damsteen[] damsteenInformatie) {
  for (int i = 0; i<damsteenInformatie.length; i++) {
    fill(damsteenInformatie[i].kleur);
    ellipse(damsteenInformatie[i].x, damsteenInformatie[i].y, damsteenInformatie[i].diameter, damsteenInformatie[i].diameter);
  }
}