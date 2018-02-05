void setup() {
  int[] array1 = {1, 3, 5, 7};
  int[] array2  = {2, 4, 6, 8};
  println (telElementenOp(array1, array2));
  println (maakMaxArray(array1, array2));
}
//Opgave A getallen uit twee arrays bij elkaar optellen
int[] telElementenOp(int[] arrayA, int[] arrayB) {
  int[][]tijdelijk = {arrayA, arrayB};
  int[]uitvoer = new int[tijdelijk.length];
  for (int j = 0; j < tijdelijk.length; j++) {
    int opgeteld = 0;
    for (int i = 0; i<tijdelijk[j].length; i++) {
      opgeteld += tijdelijk[j][i];
    }
    uitvoer[j] = opgeteld;
  }
  return uitvoer;
}

//Opgave B maximum bepalen van twee arrays
int[] maakMaxArray(int[] arrayA, int[] arrayB) {
  int[][]tijdelijk = {arrayA, arrayB};
  int[]uitvoer = new int[tijdelijk.length];
  for (int j = 0; j < tijdelijk.length; j++) {
    int hoogsteGetal = tijdelijk[j][0];
    for (int i = 0; i<tijdelijk[j].length; i++) {
      if (tijdelijk[j][i] > hoogsteGetal) {   
        hoogsteGetal = tijdelijk[j][i];
      }
    }
    uitvoer[j] = hoogsteGetal;
  }
  return uitvoer;
}