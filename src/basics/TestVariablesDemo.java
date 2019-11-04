package basics;

public class TestVariablesDemo {
	public static void main(String[] args) {
		// from this class access and assign some values to the variables of VariablesDemo class
		// assign some value to the instance variable i of VarialbesDemo class
		// create an object of VariablesDemo class
		VariablesDemo obj1 = new VariablesDemo();
		obj1.i = 9;
		
		// assign some value to the static variable j of VarialbesDemo class
		VariablesDemo.j = 25;
		
		// calling instance method of VariablesDemo class
		obj1.imethod();
	}

}
