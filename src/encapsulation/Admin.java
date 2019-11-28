package encapsulation;

import java.util.Scanner;

// admin can modify price and discount of produt(EncapsulationDemo)
public class Admin {
	
	private int pin;

	public Admin(int pin) {
		this.pin = pin;
	}
	
	public boolean authenticate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your pin");
		int p = sc.nextInt();
		if(this.pin == p) {
			System.out.println("valid pin");
			return true;
		}else {
			System.out.println("invalid pin".toUpperCase());
			return false;
		}
		
	}
	
	

}
