Klok deKlok;

void setup(){
  size(400,300);
  background(255);
  deKlok = new Klok(150,100,200);
  deKlok.setTijd(23,58);
  deKlok.tik();
  deKlok.tik();
  deKlok.tekenKlok();
}

/*B
Mijn voorkeur gaat uit naar verhouding tussen de hoogte en breedte in Klok want daar
werkt het goed en is het overzichtelijk. In Klok teken je de klok dus is het niet logisch
om het in Teller te zetten.

Opgave toString in Klok
A
De informatie die ik in de string representatie van Klok zou stoppen is de tijd maar
in een zin.*/