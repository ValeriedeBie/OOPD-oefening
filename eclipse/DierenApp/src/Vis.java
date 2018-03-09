
public class Vis extends Dier{
	private int aantalEieren;
	
	public Vis(int x, int y, int aantalEieren) {
		super(x,y);
		this.aantalEieren = aantalEieren;
	}
	
	public void plantVoort() {
		this.aantalEieren += 1;
	}
}
