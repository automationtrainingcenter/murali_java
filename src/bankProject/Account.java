package bankProject;

public interface Account {

	// Deposits
	void deposit(double amount);

	// withdraw
	double withdraw(double amount);

	// get balance
	double getBalance();

	public long getPhnum();

	public void setPhnum(long phnum);

	public int getPin();

	public void setPin(int pin);

	public int getAccNum();

	public String getName();

}
