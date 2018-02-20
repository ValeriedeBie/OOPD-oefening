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
  for (int i = 0; i<stenen.length; i++) {
    stenen[i].tekenDamsteen();
  }
}

void mouseClicked(){
  for(int i = 0; i <stenen.length; i++){
    stenen[i].isGeselecteerd();
    delay(200);
  }
}