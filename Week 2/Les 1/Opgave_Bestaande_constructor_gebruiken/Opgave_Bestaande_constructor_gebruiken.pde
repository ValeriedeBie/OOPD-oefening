int uren, minuten;

void setup() {
  size(500, 500);
  setTijd();
  Klok klok1 = new Klok(width/2, height/2, width/2, uren, minuten);
  klok1.tekenKlok();
}

void draw() {
}

void setTijd() {
  uren = hour();
  minuten = minute();
}