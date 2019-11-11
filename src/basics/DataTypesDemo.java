package basics;
/*
 * data type is nothing but type of the data we are going to store in a variable
 * In java we have mainly two types of data types
 * 1. primitive
 * 		boolean either true or false - Boolean
 * 		char which will store single character - Character
 *		byte store integer values - Byte
 *		short store integer values - Short
 *		int store integer values -Integer
 *		long store integer values - Long
 *		float store floating point number -Float
 *		double store floating point number - Double
 * 	
 * 2. reference
 * 		Arrays
 * 		Strings
 * 
 *  Wrapper class: For every primitive data_type we have an equivalent class in Java. Those classes
 * are known as Wrapper classes. These are used to perform different operations on data.
 * 		1. Boolean
 * 		2. Character
 * 		3. Byte
 * 		4. Short
 * 		5. Integer
 * 		6. Long
 * 		7. Float
 * 		8. Double
 * 
 * 	WCData_type obj_name = new WCData_type(value);
 * 
 * 	Type Casting: converting one type of data to another type of data
 * 	up casting: lower memory type to higher memory type : widening : no data loss
 * 	down casting: higher memory data type to lower memory data type : narrowing : data loss is possible
 * 
 * 	Converting primitive data type to wrapper class: boxing
 *  Converting wrapper to primitive : un-boxing
 * 
 * 
 * syntax to create primitive data type
 * data-type var-name  = value; //initialization
 * data-type var-name; //declaration
 * var-name = value; //assignment to the variable which is already declared
 * 
 * variable is nothing but name of memory location where we are storing data
 */

public class DataTypesDemo {

	public static void main(String[] args) {
		// boolean
		boolean b = true;
		// sysout and press control space
		System.out.println("boolean value is " + b);

		// char
		char ch = 'a';
		System.out.println("character value is " + ch);
		System.out.println("max value of character type is " + Character.MAX_VALUE);
		System.out.println("min value of character type is " + Character.MIN_VALUE);
		System.out.println("size of character type in bits is " + Character.SIZE);
		System.out.println("size of character type in bytes is " + Character.BYTES);

		// byte
		byte by = 100;
		System.out.println("byte value is " + by);
		System.out.println("max value of byte type is " + Byte.MAX_VALUE);
		System.out.println("min value of byte type is " + Byte.MIN_VALUE);
		System.out.println("size of byte type in bits is " + Byte.SIZE);
		System.out.println("size of byte type in bytes is " + Byte.BYTES);

		// short
		short sh = 1230;
		System.out.println("short value is " + sh);
		System.out.println("max value of short type is " + Short.MAX_VALUE);
		System.out.println("min value of short type is " + Short.MIN_VALUE);
		System.out.println("size of short type in bits is " + Short.SIZE);
		System.out.println("size of short type in bytes is " + Short.BYTES);

		// int
		int i = 1234567;
		System.out.println("integer value is " + i);
		System.out.println("max value of integer type is " + Integer.MAX_VALUE);
		System.out.println("min value of integer type is " + Integer.MIN_VALUE);
		System.out.println("size of integer type in bits is " + Integer.SIZE);
		System.out.println("size of integer type in bytes is " + Integer.BYTES);

		// long
		long l = 12345678989l;
		System.out.println("long value is " + l);
		System.out.println("max value of long type is " + Long.MAX_VALUE);
		System.out.println("min value of long type is " + Long.MIN_VALUE);
		System.out.println("size of long type in bits is " + Long.SIZE);
		System.out.println("size of long type in bytes is " + Long.BYTES);

		// float
		float fl = 12.4f;
		System.out.println("float value is " + fl);
		System.out.println("max value of float type is " + Float.MAX_VALUE);
		System.out.println("min value of float type is " + Float.MIN_VALUE);
		System.out.println("size of float type in bits is " + Float.SIZE);
		System.out.println("size of float type in bytes is " + Float.BYTES);

		// double
		double d = 123.456;
		System.out.println("double vlaue is " + d);
		System.out.println("max value of double type is " + Double.MAX_VALUE);
		System.out.println("min value of double type is " + Double.MIN_VALUE);
		System.out.println("size of double type in bits is " + Double.SIZE);
		System.out.println("size of double type in bytes is " + Double.BYTES);
		
		// upcasting: lower to higher
		short shLow  = 1234;
		int iHigh = shLow;
		System.out.println(iHigh);
		
		int ilow = 12345;
		float fhigh = ilow;
		System.out.println(fhigh);
		
		
		// down casting: higher to lower
		// lower_data_type var_name = (lower_data_type) higher_data_type_var_name
		short shHigh = 400;
		byte byLow = (byte) shHigh;
		System.out.println(byLow);
		
		double dhigh = 123.45;
		int il = (int) dhigh;
		System.out.println(il);
		
		
	}

}
