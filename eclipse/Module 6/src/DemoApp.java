public class DemoApp {

	public static void main(String[] args) {
		Student s1 = new Student("han");
		Student s2 = new Student("icarus");
		Student s3 = new Student("femke");
		
		s1.setGeslacht(Student.MAN);
		s2.setGeslacht(Student.MAN);
		s3.setGeslacht(Student.VROUW);
		
		System.out.println(Student.getnStudenten());
	}

	
}
