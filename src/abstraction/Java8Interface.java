package abstraction;

/*
 * From Java 8 interface can have concrete methods i.e. methods with definition.
 * these methods either default methods or static methods.
 * here default is not same as default access modifier
 */
public interface Java8Interface {

	void methodOne();

	// default method
	public default void methodTwo() {
		System.out.println("method two with default definition in Interface");
	}

	// static method
	public static void methodThree() {
		System.out.println("method three static method definition in Interface");
	}

}
