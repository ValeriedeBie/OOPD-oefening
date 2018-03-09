import java.util.ArrayList;

public class DierenApp {

	public static void main(String[] args) {
		Dier v = new Vis(20, 4, 17);
		Dier z = new Zoogdier(1, 5, 5);

		ArrayList<Dier> dierentuin = new ArrayList<Dier>();
		dierentuin.add(v);
		dierentuin.add(z);
		
		for(Dier dier: dierentuin) {
			dier.bewegen();
			dier.plantVoort();
		}
		System.out.println(z);
		System.out.println(v);
	}

}
