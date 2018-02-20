class Dobbelsteen{
  int aantalStippen;
  
  Dobbelsteen(){
    this.aantalStippen = int(random(1,7));
  }
  
  String toString(){
    return "Het aantal stippen is: " + aantalStippen;
  }
}