
public class SnelheidReageerder implements IReageerder{
	public void doeActie(WeergaveObject object) {
		System.out.println("Snelheid joe");
		object.setSnelheid(5,5);
	}
}