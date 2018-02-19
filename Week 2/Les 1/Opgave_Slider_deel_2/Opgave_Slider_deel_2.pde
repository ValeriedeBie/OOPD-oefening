Slider[] sliders;
void setup() {
  size(300, 200);
  background(0);
  sliders = new Slider[1];
  for (int i = 0; i<sliders.length; i++) {
    sliders[i] = new Slider();
  }
}

void draw() {
  for (int i = 0; i<sliders.length; i++) {
    sliders[i].bepaalSliderPositie();
    sliders[i].tekenSlider();
  }
  
  println(sliders);
}