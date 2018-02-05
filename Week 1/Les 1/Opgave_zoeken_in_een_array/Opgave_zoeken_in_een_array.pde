//Opgave Zoeken in een array
boolean komtGetalVoorIn(int getal, int[] lijst){
  boolean waarde = false;
  for(int i = 0; i < lijst.length; i++){
    if(getal == lijst[i]){
      waarde = true;
    }
  }
  return waarde;
}

int[] lijst = {1,65,74,23};

void setup(){
  println (komtGetalVoorIn(65, lijst));
  println (komtGetalVoorIn(64, lijst));
}