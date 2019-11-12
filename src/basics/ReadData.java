package basics;

import java.util.Scanner;

/*
 * To read data from the console we have to use Scanner class
 * this Scanner class provides several methods to read different types of data
 * all these methods are instance methods so we have to create an object of Scanner class
 * to call these methods.
 */
public class ReadData {
	public static void main(String[] args) {
		// create an object of Scanner class
		Scanner sc = new Scanner(System.in);

		// read an integer value
		System.out.println("enter a integer number");
		int i = sc.nextInt();
		System.out.println("i = " + i);

		// read a float value
		System.out.println("enter a float number");
		float f = sc.nextFloat();
		System.out.println("f = " + f);

		// read boolean data
		System.out.println("enter a boolean data");
		boolean b = sc.nextBoolean();
		System.out.println("b = " + b);

		// read a double value
		System.out.println("enter a double number");
		double d = sc.nextDouble();
		System.out.println("d = " + d);

		// read short value
		System.out.println("enter a short number");
		short sh = sc.nextShort();
		System.out.println("sh = " + sh);

		// read a long value
		System.out.println("enter a long number");
		long l = sc.nextLong();
		System.out.println("l = " + l);

		// read a byte number
		System.out.println("enter a byte number");
		byte by = sc.nextByte();
		System.out.println("by = " + by);

		// read a character
		// to read a character Scanner does not provide any method
		// we can read single character as a string and then we can get character from
		// string
		// using charAt() of String class
		// read a string first
		System.out.println("enter a character");
//		String str = sc.next();
//		char ch = str.charAt(0);
		char ch = sc.next().charAt(0); // object chaining
		System.out.println("ch = " + ch);
	}

}
