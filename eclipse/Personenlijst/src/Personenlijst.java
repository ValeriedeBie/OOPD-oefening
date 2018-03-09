import java.util.ArrayList;

public class Personenlijst {
	private ArrayList<Persoon> lijst;

	public Personenlijst() {
		lijst = new ArrayList<>();
	}

	public ArrayList<Persoon> getSLBStudenten(Persoon SLBer) {
		ArrayList<Persoon> personenLijst = new ArrayList<Persoon>();
		for (Persoon p : lijst) {
			if (p.getSLBer() == SLBer) {
				personenLijst.add(p);
			}
		}
		return personenLijst;
	}

	public static void main(String[] args) {
		Personenlijst p = new Personenlijst();
		Persoon piet = new Docent("Piet", "Jansen", "jnsnp");
		Student marie = new Student("Marie", "Pieters", 31415, piet);
		Student jan = new Student("Jan", "de Vries", 92653, null); // nog geen SLB’er
		p.lijst.add(piet);
		p.lijst.add(marie);
		p.lijst.add(jan);
		// voeg zelf nog enkele docenten en studenten toe
		ArrayList<Persoon> studentenVanPiet = p.getSLBStudenten(piet);
		System.out.println(studentenVanPiet);
	}
}
