package abstraction;

import abstraction.Outer.Inner;

public class OuterInnerImple implements Outer, Inner{

	@Override
	public void outerMethod() {
		System.out.println("outer method implementation");
	}

	@Override
	public void innerMethod() {
		System.out.println("inner method implementation");
	}

	@Override
	public Inner method() {
		return this;
	}

	
	
}
