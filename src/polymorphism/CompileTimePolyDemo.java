package polymorphism;

public class CompileTimePolyDemo {
	
	public void add(int a, String b) {
		System.out.println(a+b);
	}
	
	// changing type of the inputs
	public void add(String a, String b) {
		System.out.println(a+b);
	}
	
	// changing sequence of inputs
	public void add(String b, int a) {
		System.out.println(a+b);
	}
	
	// changing number of inputs
	public void add(int a, String b, int c) {
		System.out.println(a+b+c);
	}
	
	// changing the return type only
//	public int add(int a, String b) {
//		return 100;
//	}
	                             
}
