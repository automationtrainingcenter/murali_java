package access_modifiers;
/*
 * In Java we have 4 access modifiers
 * 
 * 1. public: can access anywhere without any restrictions
 * 2. private: can access within the class only we can't access outside the class including child class also
 * 3. default: can access within the package only, outside the package we can't access them
 * 4. protected: same as default. outside the package child class object can access.
 */



public class AccessModifiersDemo {
	
	public String pVar = "public variable";
	private String prVar = "private variable";
	String dVar = "default variable";
	protected String proVar = "protected variable";
	
	
	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println(obj.pVar);
		System.out.println(obj.prVar);
		System.out.println(obj.dVar);
		System.out.println(obj.proVar);
	}
	

}
