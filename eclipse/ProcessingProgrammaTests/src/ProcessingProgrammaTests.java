
import processing.core.PApplet;

public class ProcessingProgrammaTests extends PApplet{

	public static void main(String[] args) {
		PApplet.main(new String[] {"ProcessingProgrammaTests"});
	}
	
	public void settings() {
		size(500,500);
		
	}
	public void setup() {
		background(0);
		fill(255);
		rect(10,10,50,50);
	}
	
}
