import java.util.Random;

public class TestStudieadviesApp {

	public static void main(String[] args) {
		Random r = new Random();

		
		RandomStudentenGenerator R = new RandomStudentenGenerator();
		R.genereerStudenten(5);
		for (int j = 0; j < R.getStudentenLijst().length; j++) {
			System.out.println(R.getStudentenLijst()[j]);
			System.out.println(Studieadviseur.krijgtPositiefStudieadvies(R.getStudentenLijst()[j]));
			System.out.println("------------------");
		}
	}
}
