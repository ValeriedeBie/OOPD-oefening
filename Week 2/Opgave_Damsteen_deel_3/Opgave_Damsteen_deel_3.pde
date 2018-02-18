//Damsteen[] damstenen = new Damsteen[5];
Damsteen witteSteen1 = new Damsteen(30, 40, 50, 255);
Damsteen witteSteen2 = new Damsteen(90, 40, 50, 255);
Damsteen zwarteSteen1 = new Damsteen(30, 340, 50, 0);
Damsteen zwarteSteen2 = new Damsteen(90, 340, 50, 0);
Damsteen[] stenen = {witteSteen1, witteSteen2, zwarteSteen1, zwarteSteen2};

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