
public abstract class Dier {
	protected int x, y;
	
	public Dier(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void bewegen() {
		this.x += 1;
	}
	
	public abstract void plantVoort();
	
	public String toString() {
		return "Ik sta op x: " + this.x + " en y: " + this.y;
	}
}
