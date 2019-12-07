package abstraction;

public class MultipleInterfaceImpl implements InterfaceOne, InterfaceTwo{

	@Override
	public void methodOne() {
		System.out.println("InterfaceOne method one implementation");
	}

	@Override
	public void methodTwo() {
		System.out.println("InterfaceTwo mehtod two implementation");
	}

	@Override
	public void method() {
		System.out.println("common method implementation");
	}
	
	
	
	

}
