package polymorphism;
/*
 * Polymorphism means one object behaving differently based on the input or environment.
 * We have two types of Polymorphism
 * 1. Compile time polymorphism or method overloading
 * 		To Achieve CTP we need a class with multiple methods of same name. 
 * 	 	We can achieve CTP in 3 ways
 * 		1. by changing the number of arguments of a method
 * 		2. by changing the sequence of arguments
 * 		3. by changing the type of arguments
 * 		By simply changing the return type of a method we can't achieve CTP or method overloading
 * 
 * 2. Runtime polymorphism or method overriding
 * 		To achieve method overriding or RTP we need two classes which are in parent and child relation
 * 		we are going to override the definition of parent class method in child class. The child class
 *  method will have the same signature as the parent class method.
 * 	
 */
public class PolymorphismDemo {
	
	public static void main(String[] args) {
		CompileTimePolyDemo cObj = new CompileTimePolyDemo();
		cObj.add(10, "surya");
		cObj.add("surya", " prakash");
		cObj.add("selenium", 10);
		cObj.add(10, "sunshine", 90);
		
		
		// run time 
		RuntimePolyParent rcObj = new RuntimePolyChild();
		rcObj.add(10,  "20");
		
	}

}
