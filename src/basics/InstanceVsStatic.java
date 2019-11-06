package basics;

public class InstanceVsStatic {

	// instance variables
	int i1;
	int i2;
	int i3;

	// static variable
	static int s1;

	public void display() {
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println("s1 = " + s1);
	}

	public static void main(String[] args) {
		// accessing a static variable
		s1 = 1000;

		InstanceVsStatic obj1 = new InstanceVsStatic();
		obj1.i1 = 1;
		obj1.i2 = 2;
		obj1.i3 = 3;
		
		InstanceVsStatic obj2 = new InstanceVsStatic();
		obj2.i1 = 10;
		obj2.i2 = 20;
		obj2.i3 = 30;
		s1 = 5000;

		InstanceVsStatic obj3 = new InstanceVsStatic();
		obj3.i1 = 100;
		obj3.i2 = 200;
		obj3.i3 = 300;
		
		
		obj1.display();
		obj2.display();
		obj3.display();
	}
}
