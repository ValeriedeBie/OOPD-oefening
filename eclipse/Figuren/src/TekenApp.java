import java.util.ArrayList;
import processing.core.PApplet;

@SuppressWarnings("serial")
public class TekenApp extends PApplet implements IGereedschap{

	public static void main(String[] args) {
		PApplet.main("TekenApp");
	}

	private ArrayList<Vorm> vormenLijst = new ArrayList<>();
	private String huidigGereedschap = "selecteer";
	
	public void settings() {
		size(400, 400);
	}
	
	public void draw() {
		background(0);
		for (Vorm vorm : vormenLijst) {
			vorm.teken(this);
		}
	}
	
	public void mousePressed() {
		switch (huidigGereedschap) {
			case "selecteer":
				System.out.println("s");
				break;
			case "rechthoek":
				Rechthoek r = new Rechthoek( mouseX, mouseY, 50, 50);
				vormenLijst.add(r);
				break;
			case "cirkel":
				Cirkel c = new Cirkel(mouseX, mouseY, 50);
				vormenLijst.add(c);
				break;
			case "gum":
				for (int i = vormenLijst.size() - 1; i >= 0; i--) {
					Vorm vorm = vormenLijst.get(i);
					if (vorm.isMuisBinnen(mouseX, mouseY)) {
						vormenLijst.remove(i);
					}
				}
				break;
		}
	}
	
	public void keyReleased() {
		switch (key) {
			case 's':
				huidigGereedschap = "selecteer";
				break;
			case 'r':
				huidigGereedschap = "rechthoek";
				break;
			case 'c':
				huidigGereedschap = "cirkel";
				break;
			case 'g':
				huidigGereedschap = "gum";
				break;
		}
	}	
}
