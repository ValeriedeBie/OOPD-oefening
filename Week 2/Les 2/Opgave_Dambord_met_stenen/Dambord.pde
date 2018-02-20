class Dambord {
  Damsteen[] stenen;

  Dambord() {
    stenen = new Damsteen[]{  
      new Damsteen(100, 50, 50, #ffffff), 
      new Damsteen(200, 200, 50, #ffffff), 
      new Damsteen(300, 300, 50, #000000), 
      new Damsteen(300, 400, 50, #000000)
    };
  }
  
  void tekenDamsteen() {
    for (int i = 0; i<stenen.length; i++) {
      fill(stenen[i].kleur);
      ellipseMode(CORNER);
      rect(stenen[i].x, stenen[i].y, stenen[i].diameter, stenen[i].diameter);
      ellipse(stenen[i].x, stenen[i].y, stenen[i].diameter, stenen[i].diameter);
    }
  }
}