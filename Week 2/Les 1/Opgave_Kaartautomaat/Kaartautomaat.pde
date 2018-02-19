class Kaartautomaat {
  float prijs, ingeworpenGeld;
  String film;

  Kaartautomaat() {
    film = "Ye mum";
    prijs = 10.50;
  }

  Kaartautomaat(String film, float prijs) {
    this.film = film;
    this.prijs = prijs;
  }

  float berekenWisselgeld() {
    float wisselgeld = ingeworpenGeld - prijs;
    if (wisselgeld > 0) {    
      return wisselgeld;
    }
    return 0;
  }

  void leegAutomaat() {
    ingeworpenGeld = 0;
  }

  String drukKaartjeAf() {
    if (ingeworpenGeld > prijs) {
      return "Hier is uw kaartje voor de film : " + film + " van €" + prijs;
    } else {
      return "Er is meer geld nodig bbbbbitch";
    }
  }

  void verhoogIngeworpenGeld(float inwerp) {
    ingeworpenGeld += inwerp;
  }
}