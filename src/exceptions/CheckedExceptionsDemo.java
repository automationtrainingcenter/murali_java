package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionsDemo {
	
	public static void main(String[] args) {
		System.out.println("first statement");
		
		try {
			Thread.sleep(3000);
			FileInputStream fis = new FileInputStream("./credentilass.txt");
			System.out.println("file opened successfully");
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("file not available in the given location");
		}finally {
			System.out.println("inside the finally block");
		}
		System.out.println("second statement");
	}

}
