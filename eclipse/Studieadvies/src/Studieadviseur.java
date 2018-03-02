public class Studieadviseur {

	public static boolean krijgtPositiefStudieadvies(Student s) {
		float totaal = 0;
		for (int i = 0; i < s.getCijfers().length; i++) {
			if (s.getCijfers()[i] >= 6) {
				totaal++;
			}
		}
		if (totaal >= 4) {
			return true;
		} else {
			return false;
		}
	}
}
