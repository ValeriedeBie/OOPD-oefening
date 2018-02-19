Damsteen[] damstenen = new Damsteen[] { new Damsteen(30, 40, 50, 255);
                                        new Damsteen(90, 40, 50, 255);
                                        new Damsteen(30, 340, 50, 0);
                                        new Damsteen(90, 340, 50, 0);}

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