package bankProject;

public class AccountFactory {

	public static Account createAccountInstance(String accType, int accNum, String name, long phnum, int pin, double balance) {
		Account account = null;
		accType = accType.toLowerCase();
		switch (accType) {
		case "savings":
			account = new SavingsAccount(accNum, name, phnum, pin, balance);
			break;
		case "current":
			account = new CurrentAccount(accNum, name, phnum, pin, balance); 
			break;
		case "credit":
			account = new CreditAccount(accNum, name, phnum, pin, balance);
			break;
		default:
			System.out.println("invalid account type");
			break;
		}
		return account;
	}

}
