
public class Zoogdier extends Dier{
	private int aantalZuigelingen;
	
	public Zoogdier(int x, int y, int aantalZuigelingen) {
		super(x,y);
		this.aantalZuigelingen = aantalZuigelingen;
	}

	@Override
	public void plantVoort() {
		this.aantalZuigelingen += 1;		
	}
	
	@Override
	public String toString() {
		return "Ik ben zo reproductief en ik heb " + aantalZuigelingen + " kindjes geshagt";
	}
}
