package finalkeyword;
/*
 * we can declare any variable, method or class as final
 * if we declare a variable as final we can't modify that variable value i.e. it 
 * becomes constant
 * 
 * if we declare a method as final in parent class we can't override that method
 * in child class
 *
 * if we declare a class as final it, can not have child class but it can have parent class
 */

public class FinalKeywordDemo {

	int nVar = 10;
	
	final int fVar = 100;

	
	public static void main(String[] args) {
		FinalKeywordDemo obj = new FinalKeywordDemo();
		obj.nVar = 2000;
//		obj.fVar = 1000; // can't assign new values to the final variables
		
		
		
		FinalMethodParent fpObj = new FinalMethodChild();
		fpObj.methodOne();
		fpObj.methodTwo();
		
		
		
	}
}
