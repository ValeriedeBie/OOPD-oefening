
public class Student {
	String naam;
	int nummer;
	String school;
	  
	Student(String naam, int nummer, String school) {
		this.naam  = naam;
		this.nummer = nummer;
	    this.school = school;
	  }
	public String getNaam() {
		return naam;
	}

	public int getNummer() {
		return nummer;
	}
	
	public String getSchool() {
		return school;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
}
