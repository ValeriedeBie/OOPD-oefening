import java.util.ArrayList;
import processing.core.PApplet;

@SuppressWarnings("serial")
public class KnoppenApp extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main(new String[] {"KnoppenApp"});
	}
	
	public ArrayList<Radioknop> knoppen = new ArrayList<>();

	
	public void settings() {
		size(400, 400);	
	}
	
	public void setup() {		
		
		Radioknop radio1 = new Radioknop(this,100,60,50,50);
		Radioknop radio2 = new Radioknop(this, 150, 60, 50,50);
		Radioknop radio3 = new Radioknop(this, 200, 60, 50, 50);
		
		radio1.voegDoelwitToe(radio2);	
		radio1.voegDoelwitToe(radio3);
		radio2.voegDoelwitToe(radio1);
		radio2.voegDoelwitToe(radio3);
		radio3.voegDoelwitToe(radio1);
		radio3.voegDoelwitToe(radio2);

		knoppen.add(radio1);
		knoppen.add(radio2);
		knoppen.add(radio3);		
	}
	
	public void draw() {
		background(0);
		ellipse(150, 250, 50, 50);
		ellipse(200, 250, 50, 50);
		rectMode(CENTER);
		rect(175, 275, 50, 50);
		rect(175, 310, 50, 50);
		ellipse(175, 330, 50, 50);
		for (Radioknop k : knoppen) {
			k.tekenKnop();
		}
	}
	
	public void mousePressed() {
		for (Radioknop k : knoppen) {
			if (k.isMuisOverKnop()) {
				k.handelInteractieAf();
			}
		}
	}
}
