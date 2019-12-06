package finalkeyword;

public class FinalMethodChild extends FinalMethodParent{

	@Override
	public void methodOne() {
		System.out.println("overriden definition of method one from FinalMethodChild");
	}
	
//	@Override
//	public void methodTwo() {
//		
//	}
	// can't override Parent class final methods in child class
	
	

}
