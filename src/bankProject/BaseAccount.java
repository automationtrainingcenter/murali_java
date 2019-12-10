package bankProject;

import java.util.Scanner;

public class BaseAccount implements Account {

	// properties
	private int accNum;
	private String name;
	private long phnum;
	protected int pin;
	protected double balance;
	private Scanner sc = new Scanner(System.in);

	public BaseAccount(int accNum, String name, long phnum, int pin, double balance) {
		this.accNum = accNum;
		this.name = name;
		this.phnum = phnum;
		this.pin = pin;
		this.balance = balance;
	}

	public long getPhnum() {
		return phnum;
	}

	public void setPhnum(long phnum) {
		this.phnum = phnum;
	}

	public int getPin() {
		System.out.println("enter registred phone number " + Long.toString(this.phnum).subSequence(0, 3));
		long phnum = sc.nextLong();
		if (this.phnum == phnum) {
			return pin;
		}
		return 0;

	}

	public void setPin(int pin) {
		System.out.println("enter your old pin");
		int oldPin = sc.nextInt();
		if (oldPin == this.pin) {
			this.pin = pin;
			System.out.println("pin changed successfully");
		} else {
			System.out.println("invalid pin");
		}
	}

	public int getAccNum() {
		return accNum;
	}

	public String getName() {
		return name;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void deposit(double amount) {
		if (amount >= 0) {
			this.balance += amount;
			System.out.println("deposit success");
		} else {
			System.out.println("invalid amount");
		}
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
					return amount;
				}
			} else {
				System.out.println("invalid amount");
			}
		} else {
			System.out.println("invalid pin");
		}

		return 0;
	}

	@Override
	public String toString() {
		return "name = "+this.name+"\tphnum = "+this.phnum+"\tbalance = "+this.balance;
	}
	


}
