package bankProject;

public class TestAccount {
public static void main(String[] args) {
	Account account = AccountFactory.createAccountInstance("credit", 987123, "surya", 987654320l, 1100, 50000);
	System.out.println(account);
	
	account.withdraw(10000);
	System.out.println(account.getBalance());
	
	
	account.deposit(5000);
	System.out.println(account.getBalance());
}
}
