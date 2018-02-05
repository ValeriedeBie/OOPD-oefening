float floatDelen(int a, int b){
  return (float) a / (float) b;
}
void setup(){
  println (floatDelen(5,2));
  println (floatDelen(10,3));
  println (floatDelen(20,9));
}

//Opgave Delen door nul
//A println (floatDelen(5, 2); -> Er mist een haakje, syntax error, compile-time
//B println (floatDelen(5, 2.0)); -> Je wilt een float in een int stoppen, compile-time
//C println (1 / 0); -> Je kan niet delen door nul, runtime