package bankProject;

public class CreditAccount extends BaseAccount {
	private double cashLimit;
	private double dueAmount;

	public CreditAccount(int accNum, String name, long phnum, int pin, double balance) {
		super(accNum, name, phnum, pin, balance);
		// here balance means credit limit
		this.cashLimit = this.balance * 0.3;
		this.dueAmount = 0;
	}

	@Override
	public void deposit(double amount) {
		if (amount >= 0) {
			if (amount <= this.dueAmount) {
				this.dueAmount -= amount;
				this.balance += amount;
				if (this.cashLimit <= this.balance * 0.3) {
					this.cashLimit = this.balance * 0.3;
				}
				System.out.println("Payment success");
			} else {
				System.out.println("can't accept amount morethan due amount i.e. " + this.dueAmount);
			}
		} else {
			System.out.println("invalid amount");
		}
	}

	@Override
	public double withdraw(double amount) {
		if (amount >= 0) {
			if (amount <= this.cashLimit) {
				this.balance -= amount;
				this.cashLimit = this.balance * 0.3;
				this.dueAmount += amount;
				System.out.println("withdraw success");
				return amount;
			} else {
				System.out.println("insufficient balance");
			}
		} else {
			System.out.println("invalid amount");
		}
		return 0;
	}
	
	

}
