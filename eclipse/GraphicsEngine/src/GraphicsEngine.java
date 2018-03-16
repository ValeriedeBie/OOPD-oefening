import java.util.ArrayList;

import processing.core.PApplet;

public class GraphicsEngine extends PApplet {

	public static void main(String[] args) {
		PApplet.main(new String[] { "GraphicsEngine" });

	}

	// ArrayList<WeergaveObject> weergaveLijst = new ArrayList<WeergaveObject>();
	public void settings() {
		size(500, 500);
	}

	WeergaveObjectContainer container = new WeergaveObjectContainer(0, 0);
	WeergaveObject rechthoek1 = new Rechthoek(50, 50, 50, 50, 0x00FFFFFF);
	WeergaveObject hoi = new Rechthoek(80, 10, 50, 50, 0);

	public void setup() {
		container.voegWeergaveObjectToe(rechthoek1);
		container.voegWeergaveObjectToe(hoi);
		// weergaveLijst.add(rechthoek1);
		// weergaveLijst.add(hoi);
		HalloReageerder halloreageerder = new HalloReageerder();
		rechthoek1.voegReageerderToe(halloreageerder);
		hoi.voegReageerderToe(halloreageerder);
		SnelheidReageerder snelheidreageerder = new SnelheidReageerder();
		rechthoek1.voegReageerderToe(snelheidreageerder);
		hoi.voegReageerderToe(snelheidreageerder);
		// TODO Test WeergaveObjectContainer
		// geefWeer
		// doeStap
		// voegToe
		// verwijder
	}

	public void draw() {
		// for (WeergaveObject wl : weergaveLijst) {
		// wl.geefWeer(this, 0, 0);
		// }
		background(0);
		container.geefWeer(this, 0, 0);
		container.doeStap();
	}

	public void mousePressed() {
		// for (WeergaveObject wl : weergaveLijst) {
		// wl.geefMousePressedGebeurtenis(mouseX, mouseY);
		// }
		container.geefMousePressedGebeurtenis(mouseX, mouseY);
	}

}
