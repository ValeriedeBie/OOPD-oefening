import processing.core.PApplet;

public class Tekstraam implements IDoelwit{
	
	private PApplet app;
	private String tekst;
	private float x,y;
	
	Tekstraam(PApplet app, String tekst, float x, float y){
		this.app = app;
		this.tekst = tekst;
		this.x = x;
		this.y = y;
	}
	
	public void voegDoelwitToe(IDoelwit doelwit) {
		
	}
	
	public void teken() {
	}
}
