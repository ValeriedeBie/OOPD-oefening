class Kaartautomaat {
  float ingeworpenGeld;
  int geselecteerdKaartje;
  Kaartje[] kaartjes;

  Kaartautomaat() {
    kaartjes = new Kaartje[]{
      new Kaartje("Mean Girls", 10.50), 
      new Kaartje("Folm", 9.50), 
      new Kaartje("Up", 6.00)
    };
  }

  float berekenWisselgeld() {
    float wisselgeld = ingeworpenGeld - kaartjes[geselecteerdKaartje].prijs;
    if (wisselgeld > 0) {    
      return wisselgeld;
    }
    return 0;
  }

  void leegAutomaat() {
    ingeworpenGeld = 0;
  }

  String drukKaartjeAf() {
    if (ingeworpenGeld > kaartjes[geselecteerdKaartje].prijs) {
      return "______________________________________________________\n|Hier is uw kaartje voor de film : " 
        + kaartjes[geselecteerdKaartje].film + " van €" + kaartjes[geselecteerdKaartje].prijs + 
        "|\n|Uw wisselgeld is €" + berekenWisselgeld() + "|\n______________________________________________________";
    } else {
      return "Er is meer geld nodig bbbbbitch";
    }
  }

  void verhoogIngeworpenGeld(float inwerp) {
    if (inwerp > 0) {
      ingeworpenGeld += inwerp;
    }
  }

  void selecteerKaartje(int kaartje) {
    if (kaartje <= kaartjes.length) {
      geselecteerdKaartje = kaartje;
    }
  }
}