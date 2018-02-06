//Onderdeel B
String[] idLijst = {"8b3", "4bf", "9h0"};

void setup() {
  println(plakCodeVoorId(idLijst[0], "NL") + "=NL8b3, NL4bf, NL9h0");
  println(plakCodeVoorIdLijst(idLijst, "NL"));
}

String plakCodeVoorId(String id, String code) {
  return code + id;
}

String[] plakCodeVoorIdLijst(String[] idLijst, String code){
  String[] lijst = new String [idLijst.length];
  for(int i = 0; i<idLijst.length; i++){
    lijst[i] = code + idLijst[i];
  }
  return lijst;
}