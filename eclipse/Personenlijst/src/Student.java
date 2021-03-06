public class Student extends Persoon {
	protected int nummer;
	protected Persoon SLBer;
	
	public Student(String naam, String voornaam, int nummer, Persoon SLBer) {
		super(naam, voornaam);
		this.nummer = nummer;
		this.SLBer = SLBer;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public Persoon getSLBer() {
		return SLBer;
	}

	public void setSLBer(Docent sLBer) {
		SLBer = sLBer;
	}

	@Override
	public String toString() {
		return "Student [nummer=" + nummer + ", SLBer=" + SLBer + ", naam=" + naam + ", voornaam=" + voornaam + "]";
	}

}
