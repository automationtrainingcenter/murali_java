package access_modifiers;

public class PrivateDemo {
	
	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println(obj.pVar);
//		System.out.println(obj.prVar); // private properties or methods of a class can't be accessed outside of that class
		System.out.println(obj.dVar);
		System.out.println(obj.proVar);
	}

}
