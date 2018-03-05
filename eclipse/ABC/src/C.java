public class C extends B {
	protected String s;
	
	public C(String s1, String s2, String s3) {
		super(s1, s2);
		s = s3;
		System.out.println(A.s);
		System.out.println(B.s);
		System.out.println(s);
	}

}

//Je kan ze niet printen als je alles veranderd in s. Als je de variabelen static maakt lukt het wel.