package bankProject;

import java.util.Scanner;

public class SavingsAccount extends BaseAccount{
	private static long minBalance = 10000;
	private Scanner sc = new Scanner(System.in);

	public SavingsAccount(int accNum, String name, long phnum, int pin, double balance) {
		super(accNum, name, phnum, pin, balance);
		System.out.println("savings account created successfully");
	}

	@Override
	public double withdraw(double amount) {
		System.out.println("enter your pin");
		int pin = sc.nextInt();
		if (this.pin == pin) {
			if (amount >= 0) {
				if (amount <= this.balance) {
					this.balance -= amount;
					System.out.println("please collect your cash");
					if(this.balance < minBalance) {
						this.balance -= 100;
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
