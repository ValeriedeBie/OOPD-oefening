public class Student {	
	private String naam;
	private String geslacht;
	private static int nStudenten = 0;
	public final static String MAN = "man";
	public final static String VROUW = "vrouw";
	
	public Student(String naam) {
		this.naam = naam;
		nStudenten++;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public void setNaam(String naam) {
		this.naam = naam;
	}

	public static int getnStudenten() {
		return nStudenten;
	}

	public String getGeslacht() {
		return geslacht;
	}

	public void setGeslacht(String geslacht) {
		this.geslacht = geslacht;
	}

}
