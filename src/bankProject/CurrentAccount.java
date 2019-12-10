package bankProject;

import java.util.Scanner;

public class CurrentAccount extends BaseAccount{
	
	private static double minBalance = 25000;
	

	public CurrentAccount(int accNum, String name, long phnum, int pin, double balance) {
		super(accNum, name, phnum, pin, balance);
	}
	
	@Override
	public double withdraw(double amount) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your pin");
		int pin = sc.nextInt();
		if (this.pin == pin) {
			if (amount >= 0) {
				if (amount <= this.balance) {
					this.balance -= amount;
					System.out.println("please collect your cash");
					if(this.balance < minBalance) {
						this.balance -= 500;
					}
					return amount;
				}else {
					System.out.println("insufficient balance");
				}
			} else {
				System.out.println("invalid amount");
			}
		} else {
			System.out.println("invalid pin");
		}

		return 0;
	}
	

}
