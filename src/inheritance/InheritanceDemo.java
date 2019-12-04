package inheritance;

/*
 * Inheritance means acquiring the properties and behavior (methods) of one class (parent or super or base)in 
 * another class (child or sub). The main advantage of Inheritance is code re-usability
 * 
 * There are 5 types of inheritance in OOP
 * 
 * single: single parent and single child. A -> B
 * multilevel: parent and child and sub child. A->B->C
 * Hierarchical: single parent and multiple child. A->B A->C
 * multiple: multiple parent and single child. A->C B->C
 * Hybrid: combination hierarchical and multiple. 
 * 
 * 
 * multiple and hybrid inheritance is not possible directly in Java.
 * 
 * Inside the child class we can access Parent class properties and methods directly and outside the child class
 * By creating a child class object we can access parent class properties and methods
 * 
 * To achieve inheritance we have to use extends keyword
 * 
 * child class extends parent class
 * 
 * super keyword always represents the parent class instance. 
 * 
 * if a Parent class have a parameterized constructor only then child class must 
 * contain a parameterized constructor which will call the Parent class constructor
 */

public class InheritanceDemo {
	
	public static void main(String[] args) {
//		Parent p = new Parent();
//		p.methodOne();
		
		// Single inheritance
		ChildOne c1Obj = new ChildOne();
		c1Obj.methodTwo(); // ChildOne
		c1Obj.methodOne(); // Parent

		
		// multilevel inheritance
		SubChild scObj = new SubChild();
		scObj.methodThree(); // SubChild
		scObj.methodTwo(); // ChildOne
		scObj.methodOne(); // Parent
		
		// hierarchical inheritance
		// ChildOne and ChildTwo are child classes of Parent class
		ChildTwo c2Obj = new ChildTwo();
		c2Obj.methodFour(); // ChildTwo
		c2Obj.methodOne(); // Parent
		
		// object creation to the Child class and object reference to the Parent class
		Parent pObj = new ChildOne();
		pObj.methodOne();
		
		// lower_type  obj-name = (lower_type) higher_type_obj
		ChildOne pcObj = (ChildOne) pObj;
		pcObj.methodTwo();
//		pcObj.methodOne();
		
	
		
	}
	

}
