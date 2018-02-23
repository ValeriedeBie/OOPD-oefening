public class Programma {
	public static void main(String[] args) {		  
		Student s1 = new Student("hanneke", 1, "ICA");
		Student s2 = new Student("femke", 2, "ICA");
		System.out.println(s1.getNaam() + "\t" + s1.getNummer() + "\t" + s1.getSchool());
		System.out.println(s2.getNaam() + "\t" + s2.getNummer() + "\t" + s2.getSchool());
	}
}
