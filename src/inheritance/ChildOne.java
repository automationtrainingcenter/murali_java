package inheritance;

public class ChildOne extends Parent{

	public ChildOne() {
		super(); // Parent class constructor call
		System.out.println("ChildOne class object created");
		
	}
	
	public void methodTwo() {
		System.out.println("ChildOne class method two");
	}

}
