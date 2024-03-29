package abstraction;

import abstraction.Outer.Inner;

/*
 * Abstraction means a plan or template to create a class
 * Abstraction means hiding the implementation details of methods
 * we have two to implement abstraction
 * 1. abstract classes
 * 		It is class which contains at least one abstract method and declared using "abstract" keyword. 
 * Abstract method is a method with declaration only. 
 * A normal Java class "extends" this abstract class and provides implementation to the abstract methods.
 * If in case this normal Java class failed to provide implementation to any one abstract method then that
 * normal Java class also becomes abstract class.
 * An abstract class can extends another abstract class or normal java class and it can implement an interface
 * Abstract class can contain both abstract methods and concrete methods.
 * 
 * 
 * 2. Interfaces
 * 		In interface all the methods are public and abstract by default. A normal Java class "implements" 
 * interface and provides implementation to the abstract methods.
 * By default all the methods in Interface are public and abstract
 * By default all the variables of interface are public, static and final
 * An interface can extends multiple interfaces and it can't implement another interface
 * A class can implement multiple interfaces and can only extends one normal class or one abstract class
 * 
 * From Java 8 onwards interface allows concrete methods
 * These concrete methods are either static methods or "default" methods
 * We can access default method using interface reference and static method using interface name
 * we can override a default method of interface in implementation classes but
 * we can't override static method of interface
 * we can't create an instance of either abstract class or interface but we can create object reference,
 * 
 * Type of interfaces
 * Marker or tagged interface
 * 	it is an interface without any abstract methods like Serializable, Clonable .etc
 * 	Generally these interfaces provides special instructions to the JVM
 * 	we can have common parent to the multiple classes or interfaces
 * 
 * Functional interfaces
 * 	it is an interface with only one abstract method.
 * A class can implement this functional interface or we can write a lambda expression which will implement 
 * the abstract method of functional interface
 */
public class AbstractionDemo {

	public static void main(String[] args) {
		// abstract class
		AbstractClassDemo acObj = new AbstractClassChild();
		acObj.methodOne();
		acObj.methodTwo();

		// interface
		MyInterfaceOne i1Obj = new MyInterfaceImpl();
		i1Obj.methodOne();
		i1Obj.methodTwo();

		// single class implementing multiple interfaces and also multiple inheritance
		InterfaceOne i1 = new MultipleInterfaceImpl();
		i1.methodOne();
		i1.method();

//		InterfaceTwo i2 = new MultipleInterfaceImpl();
		// we no need to create one more object of MutipleInterfaceImpl we can simply
		// type
		// cast InterfaceOne object reference to the InterfaceTwo object reference
		// because
		// both are implemented by same class
//		MultipleInterfaceImpl i2 = (MultipleInterfaceImpl)i1;	
		InterfaceTwo i2 = (InterfaceTwo) i1;
		i2.methodTwo();
		i2.method();

		// inner interface
		Outer outObj = new OuterInnerImple();
		outObj.outerMethod();

//		Inner inObj = new OuterInnerImple();
//		Inner inObj = (Inner) outObj;
//		inObj.innerMethod();

//		Inner inObj = outObj.method();
//		inObj.innerMethod();
		outObj.method().innerMethod(); // object chaining

		// java 8 interface
		Java8Interface.methodThree();
		Java8Interface j8 = new Java8InterfaceImpl();
		j8.methodOne();
		j8.methodTwo();

		// functional interface implementation using normal java class
		FnInterfaceOne f1nor = new FnInterfaceOneImple();
		f1nor.methodOne();

		// functional interface implementation using anonymous class
		FnInterfaceOne f1Anon = new FnInterfaceOne() {

			@Override
			public void methodOne() {
				System.out.println("methodOne of FnInterfaceOne definition using ANONYMOUS class");
			}
		};

		f1Anon.methodOne();

		// functional interface implementation using lambda expression
		FnInterfaceOne f1Lam = () -> System.out
				.println("methodOne of FnInterfaceOne definition using LAMBDA Expression");

		f1Lam.methodOne();
	}

}
