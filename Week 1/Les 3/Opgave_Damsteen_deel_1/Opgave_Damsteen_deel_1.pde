Damsteen eenDamsteenWit;
Damsteen eenDamsteenZwart;

void setup() {
  size(500,500);
  eenDamsteenWit = new Damsteen(30, 40, 50, 255);
  eenDamsteenZwart = new Damsteen(30, 140, 50, 0);
}

void draw() {
  background(#A02323);
  tekenDamsteen(eenDamsteenWit.x, eenDamsteenWit.y, eenDamsteenWit.diameter, eenDamsteenWit.kleur);
  tekenDamsteen(eenDamsteenZwart.x, eenDamsteenZwart.y, eenDamsteenZwart.diameter, eenDamsteenZwart.kleur);
}

void tekenDamsteen(int x, int y, int diameter, int kleur){
  noStroke();
  fill(kleur);
  ellipse(x, y, diameter, diameter);
}