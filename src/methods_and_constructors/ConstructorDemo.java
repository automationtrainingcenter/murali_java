package methods_and_constructors;

/*
 * Constructor is a special method whose name is same as the class name.
 * Constructor doesn't have any explicit return type. Every Constructor will return reference(memory location) 
 * of the object
 * 
 * Constructor is used to create an instance of the class. We have two types of constructors
 * Default constructor
 * 	It will assign default values based on the data type of the instance variables
 * 
 * Parameterized constructor
 *  It will assign user defined values to the instance variables at the time of object creation 
 *  
 *  we can create n number of parameterized constructors either by changing the number of parameters, type 
 *  of parameters or sequence of parameters, this is known as constructor overloading
 *  
 * Java provides "this" keyword. "this" keyword always represents the current class instance.
 * which will differentiate instance variables with local variables.
 * We can use "this" keyword to call the constructor inside another constructor,
 * calling a constructor inside another constructor is the first line of code. This concept known as
 * constructor chaining 
 * 
 */

public class ConstructorDemo {

	int id;
	String name;

	// default constructor
	public ConstructorDemo() {
		this.id = 100;
		this.name = "surya";
	}

	// parameterized constructor
	// changing number of parameters
	public ConstructorDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// changing sequence of parameters
	public ConstructorDemo(String name, int id) {
//		this.id = id;
//		this.name = name;
		this(id, name);
	}

	// changing type of parameters
	public ConstructorDemo(String id, String name) {
//		this.id = Integer.parseInt(id);
//		this.name = name;
		this(Integer.parseInt(id), name);
	}

//	public void storeDetails(int id, String n) {
//	i = id;
//	name = n;
//}

	public static void main(String[] args) {

		ConstructorDemo obj1 = new ConstructorDemo(101, "anil");
//		obj1.i = 101;
//		obj1.name = "anil";
//		obj1.storeDetails(101, "anil");
		System.out.println(obj1.id);
		System.out.println(obj1.name);

		ConstructorDemo obj2 = new ConstructorDemo("murali", 102);
//		obj2.i = 102;
//		obj2.name = "murali";
//		obj2.storeDetails(102, "muraliS");
		System.out.println(obj2.id);
		System.out.println(obj2.name);

		ConstructorDemo obj3 = new ConstructorDemo("104", "ravi");
		System.out.println(obj3.id);
		System.out.println(obj3.name);

		ConstructorDemo obj4 = new ConstructorDemo();
		System.out.println(obj4.id);
		System.out.println(obj4.name);

	}

}
