package encapsulation;

import access_modifiers.AccessModifiersDemo;

public class ProtectedDemo extends AccessModifiersDemo{
	
	public static void main(String[] args) {
		AccessModifiersDemo pObj = new AccessModifiersDemo();
		System.out.println(pObj.pVar);
//		System.out.println(pObj.dVar);
//		System.out.println(pObj.proVar);
		
		ProtectedDemo obj = new ProtectedDemo();
		System.out.println(obj.pVar);
//		System.out.println(obj.prVar);
//		System.out.println(obj.dVar);
		System.out.println(obj.proVar); 
		// protected properties can be accessed outside the package using child class objects
	}
	
	

}
